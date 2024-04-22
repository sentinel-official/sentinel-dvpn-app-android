package co.sentinel.dvpn.hub.tasks

import co.sentinel.cosmos.base.BaseCosmosApp
import co.sentinel.cosmos.network.ChannelBuilder
import co.uk.basedapps.domain.exception.Failure
import co.uk.basedapps.domain.functional.Either
import cosmos.base.query.v1beta1.Pagination
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.guava.await
import sentinel.node.v2.Querier
import sentinel.node.v2.QueryServiceGrpc
import sentinel.types.v1.StatusOuterClass
import timber.log.Timber

class QueryNodes(
  private val app: BaseCosmosApp,
) {
  suspend fun execute(
    offset: Long = 0,
    limit: Long = 10,
  ) = kotlin.runCatching {
    val stub = QueryServiceGrpc.newFutureStub(app.channelBuilder.getMainChannel())
      .withDeadlineAfter(ChannelBuilder.TIME_OUT, TimeUnit.SECONDS)
    val response = stub.queryNodes(
      Querier.QueryNodesRequest.newBuilder()
        .setStatus(StatusOuterClass.Status.STATUS_ACTIVE)
        .setPagination(
          Pagination.PageRequest.newBuilder()
            .setLimit(limit)
            .setOffset(offset),
        )
        .build(),
    ).await()
    Either.Right(response)
  }.onFailure { Timber.e(it) }
    .getOrNull() ?: Either.Left(Failure.AppError)

  suspend fun execute(
    planId: Long,
    offset: Long = 0,
    limit: Long = 10,
  ) = kotlin.runCatching {
    val stub = QueryServiceGrpc.newFutureStub(app.channelBuilder.getMainChannel())
      .withDeadlineAfter(ChannelBuilder.TIME_OUT, TimeUnit.SECONDS)
    val response = stub.queryNodesForPlan(
      Querier.QueryNodesForPlanRequest.newBuilder()
        .setId(planId)
        .setStatus(StatusOuterClass.Status.STATUS_ACTIVE)
        .setPagination(
          Pagination.PageRequest.newBuilder()
            .setLimit(limit)
            .setOffset(offset),
        )
        .build(),
    ).await()
    Either.Right(response)
  }.onFailure { Timber.e(it) }
    .getOrNull() ?: Either.Left(Failure.AppError)
}
