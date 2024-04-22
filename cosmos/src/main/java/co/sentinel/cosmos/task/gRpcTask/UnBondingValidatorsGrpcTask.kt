package co.sentinel.cosmos.task.gRpcTask

import co.sentinel.cosmos.base.BaseConstant
import co.sentinel.cosmos.base.BaseCosmosApp
import co.sentinel.cosmos.network.ChannelBuilder
import co.sentinel.cosmos.task.CommonTask
import co.sentinel.cosmos.task.TaskResult
import com.google.protobuf.ByteString
import cosmos.base.query.v1beta1.Pagination.PageRequest
import cosmos.staking.v1beta1.QueryGrpc
import cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorsRequest
import cosmos.staking.v1beta1.QueryOuterClass.QueryValidatorsResponse
import cosmos.staking.v1beta1.Staking
import cosmos.staking.v1beta1.Staking.BondStatus
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.guava.await
import timber.log.Timber

class UnBondingValidatorsGrpcTask(app: BaseCosmosApp) :
  CommonTask(app) {
  private val mResultData = ArrayList<Staking.Validator>()
  private val mStub: QueryGrpc.QueryFutureStub

  init {
    mResult.taskType = BaseConstant.TASK_GRPC_FETCH_UNBONDING_VALIDATORS
    mStub = QueryGrpc.newFutureStub(app.channelBuilder.getMainChannel())
      .withDeadlineAfter(ChannelBuilder.TIME_OUT, TimeUnit.SECONDS)
  }

  override suspend fun doInBackground(vararg strings: String): TaskResult {
    try {
      val pageRequest = PageRequest.newBuilder().setLimit(300).build()
      val request = QueryValidatorsRequest.newBuilder().setPagination(pageRequest)
        .setStatus(BondStatus.BOND_STATUS_UNBONDING.name).build()
      val response = mStub.validators(request).await()
      mResultData.addAll(response.validatorsList)
      mResult.isSuccess = true
      mResult.resultData = mResultData
    } catch (e: Exception) {
      Timber.e("BondedValidatorsGrpcTask " + e.message)
    }
    return mResult
  }

  private suspend fun pageJob(nextKey: ByteString): QueryValidatorsResponse? {
    try {
      val pageRequest = PageRequest.newBuilder().setKey(nextKey).build()
      val request = QueryValidatorsRequest.newBuilder().setPagination(pageRequest)
        .setStatus(BondStatus.BOND_STATUS_UNBONDING.name).build()
      val response = mStub.validators(request).await()
      mResultData.addAll(response.validatorsList)
      if (response.hasPagination() && response.pagination.nextKey.size() > 0) {
        pageJob(response.pagination.nextKey)
      }
    } catch (e: Exception) {
      Timber.e("BondedValidatorsGrpcTask pageJob " + e.message)
    }
    return null
  }
}
