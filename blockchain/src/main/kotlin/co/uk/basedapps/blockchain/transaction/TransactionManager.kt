package co.uk.basedapps.blockchain.transaction

import co.sentinel.cosmos.WalletRepository
import co.sentinel.dvpn.hub.HubRemoteRepository
import co.sentinel.dvpn.hub.model.nodeSubscriptions
import co.sentinel.dvpn.hub.model.planSubscriptions
import co.uk.basedapps.domain.exception.Failure
import co.uk.basedapps.domain.functional.Either
import co.uk.basedapps.domain.functional.getOrElse
import co.uk.basedapps.domain.functional.requireRight
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.delay
import timber.log.Timber

@Singleton
class TransactionManager
@Inject constructor(
  private val walletRepository: WalletRepository,
  private val hubRepository: HubRemoteRepository,
) {

  suspend fun subscribeToNode(
    nodeAddress: String,
    denom: String,
    gigabytes: Long,
    hours: Long,
    gasPrice: Long,
    chainId: String,
  ): Either<Failure, Unit> {
    Timber.d("Subscribe to node $nodeAddress")
    val subscribePayload = hubRepository.generateNodeSubscriptionPayload(
      nodeAddress = nodeAddress,
      denom = denom,
      gigabytes = gigabytes,
      hours = hours,
    )
    if (subscribePayload.isLeft) {
      Timber.e("Subscribe to node failed: can't create payload message")
      return Either.Left(Failure.AppError)
    }

    val result = walletRepository.signSubscribedRequestAndBroadcast(
      subscribeMessage = subscribePayload.requireRight(),
      gasPrice = gasPrice,
      chainId = chainId,
    )
    if (result.isLeft) {
      Timber.e("Subscribe to node failed: message broadcast completed with an exception")
      return result
    }

    return waitForNodeSubscription(nodeAddress)
      .also {
        when {
          it.isRight -> Timber.d("Subscribed to the node: $nodeAddress")
          else -> Timber.e("Subscribe to node failed: subscription wasn't created")
        }
      }
  }

  private suspend fun waitForNodeSubscription(
    nodeAddress: String,
  ): Either<Failure, Unit> {
    repeat(5) { attempt ->
      Timber.d("Check created node subscription: ${attempt + 1}")
      val subscriptions = hubRepository.fetchSubscriptions()
        .getOrElse(emptyList())
        .nodeSubscriptions()
        .filter { it.nodeAddress == nodeAddress }

      if (subscriptions.isNotEmpty()) {
        return Either.Right(Unit)
      }
      delay(2000)
    }
    return Either.Left(Failure.AppError)
  }

  suspend fun subscribeToPlan(
    planId: Long,
    denom: String,
    gasPrice: Long,
    chainId: String,
  ): Either<Failure, Unit> {
    Timber.d("Subscribe to plan $planId")
    val subscribePayload = hubRepository.generatePlanSubscriptionPayload(
      planId = planId,
      denom = denom,
    )
    if (subscribePayload.isLeft) {
      Timber.d("Subscribe to plan failed: can't  create payload message")
      return Either.Left(Failure.AppError)
    }

    val result = walletRepository.signSubscribedRequestAndBroadcast(
      subscribeMessage = subscribePayload.requireRight(),
      gasPrice = gasPrice,
      chainId = chainId,
    )
    if (result.isLeft) {
      Timber.e("Subscribe to plan failed: message broadcast completed with an exception")
      return result
    }

    return waitForPlanSubscription(planId)
      .also {
        when {
          it.isRight -> Timber.d("Subscribed to the plan: $planId")
          else -> Timber.e("Subscribe to plan failed: subscription wasn't created")
        }
      }
  }

  private suspend fun waitForPlanSubscription(
    planId: Long,
  ): Either<Failure, Unit> {
    repeat(5) { attempt ->
      Timber.d("Check created plan subscription: ${attempt + 1}")
      val subscriptions = hubRepository.fetchSubscriptions()
        .getOrElse(emptyList())
        .planSubscriptions()
        .filter { it.planId == planId }

      if (subscriptions.isNotEmpty()) {
        return Either.Right(Unit)
      }
      delay(2000)
    }
    return Either.Left(Failure.AppError)
  }

  suspend fun makeDirectTransfer(
    recipientAddress: String,
    amount: String,
    denom: String,
    gasPrice: Long,
    chainId: String,
  ): Either<Failure, Unit> {
    val subscribePayload = hubRepository.generateDirectTransferPayload(
      recipientAddress = recipientAddress,
      amount = amount,
      denom = denom,
    )
    if (subscribePayload.isLeft) {
      return Either.Left(Failure.AppError)
    }

    return walletRepository.signSubscribedRequestAndBroadcast(
      subscribeMessage = subscribePayload.requireRight(),
      gasPrice = gasPrice,
      chainId = chainId,
    )
  }

  suspend fun startSession(
    subscriptionId: Long,
    nodeAddress: String,
    activeSession: Long?,
    gasPrice: Long,
    chainId: String,
  ): Either<Failure, Unit> {
    val connectMessage = hubRepository.generateConnectToNodeMessages(
      subscriptionId = subscriptionId,
      nodeAddress = nodeAddress,
      activeSessionId = activeSession,
    )
    if (connectMessage.isLeft) {
      return Either.Left(Failure.AppError)
    }

    return walletRepository.startNodeSession(
      messages = connectMessage.requireRight(),
      gasPrice = gasPrice,
      chainId = chainId,
    )
  }
}
