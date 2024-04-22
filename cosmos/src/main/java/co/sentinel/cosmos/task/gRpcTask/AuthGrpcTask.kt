package co.sentinel.cosmos.task.gRpcTask

import co.sentinel.cosmos.base.BaseConstant
import co.sentinel.cosmos.base.BaseCosmosApp
import co.sentinel.cosmos.network.ChannelBuilder
import co.sentinel.cosmos.task.CommonTask
import co.sentinel.cosmos.task.TaskResult
import cosmos.auth.v1beta1.QueryGrpc
import cosmos.auth.v1beta1.QueryOuterClass.QueryAccountRequest
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.guava.await
import timber.log.Timber

class AuthGrpcTask(
  app: BaseCosmosApp,
  private val mAddress: String,
) : CommonTask(app) {
  private val mStub: QueryGrpc.QueryFutureStub

  init {
    mResult.taskType = BaseConstant.TASK_GRPC_FETCH_AUTH
    mStub = QueryGrpc.newFutureStub(app.channelBuilder.getMainChannel())
      .withDeadlineAfter(ChannelBuilder.TIME_OUT, TimeUnit.SECONDS)
  }

  override suspend fun doInBackground(vararg strings: String): TaskResult {
    try {
      val request = QueryAccountRequest.newBuilder().setAddress(mAddress).build()
      val response = mStub.account(request).await()
      mResult.isSuccess = true
      mResult.resultData = response.account
    } catch (e: Exception) {
      Timber.e("AuthGrpcTask " + e.message)
    }
    return mResult
  }
}
