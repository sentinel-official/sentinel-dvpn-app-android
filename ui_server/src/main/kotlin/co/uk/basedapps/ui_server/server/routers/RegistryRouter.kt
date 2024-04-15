package co.uk.basedapps.ui_server.server.routers

import co.uk.basedapps.ui_server.common.clipboard.ClipboardManager
import co.uk.basedapps.ui_server.common.provider.AppDetailsProvider
import co.uk.basedapps.ui_server.logs.ShareLogsEvent
import co.uk.basedapps.ui_server.server.error.HttpError
import co.uk.basedapps.ui_server.server.models.AppVersionResponse
import co.uk.basedapps.ui_server.server.models.ClipboardResponse
import co.uk.basedapps.ui_server.server.models.GetRegistryResponse
import co.uk.basedapps.ui_server.server.models.PostRegistryRequest
import co.uk.basedapps.ui_server.server.utils.EventBus
import co.uk.basedapps.ui_server.storage.BasedStorage
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.delete
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.routing
import timber.log.Timber

fun Application.routeRegistry(
  storage: BasedStorage,
  appDetailsProvider: AppDetailsProvider,
  clipboard: ClipboardManager,
  eventBus: EventBus,
) {

  routing {
    get("/api/registry") {
      val key = call.request.queryParameters["key"] ?: let {
        return@get call.respond(HttpStatusCode.BadRequest, HttpError.badRequest)
      }

      val value = storage.retrieveKeyValue(key)
      if (value != null) {
        val response = GetRegistryResponse(
          key = key,
          value = value.first,
          isSecure = value.second,
        )
        return@get call.respond(HttpStatusCode.OK, response)
      } else {
        return@get call.respond(HttpStatusCode.NotFound, HttpError.notFound)
      }
    }

    delete("/api/registry") {
      val key = call.request.queryParameters["key"] ?: let {
        return@delete call.respond(HttpStatusCode.BadRequest, HttpError.badRequest)
      }

      storage.deleteKeyValue(key)
      return@delete call.respond(HttpStatusCode.OK)
    }

    post("/api/registry") {
      val request = try {
        call.receive<PostRegistryRequest>()
      } catch (e: Exception) {
        Timber.e(e)
        return@post call.respond(HttpStatusCode.BadRequest, HttpError.badRequest)
      }

      storage.storeKeyValue(
        key = request.key,
        value = request.value,
        isSecure = request.isSecure,
      )
      return@post call.respond(HttpStatusCode.OK)
    }

    get("/api/registry/version") {
      val response = AppVersionResponse(appDetailsProvider.getAppVersion())
      call.respond(HttpStatusCode.OK, response)
    }

    get("/api/registry/logs") {
      eventBus.emitEvent(ShareLogsEvent)
      call.respond(HttpStatusCode.OK)
    }

    get("/api/registry/clipboard") {
      val response = ClipboardResponse(clipboard.getFromClipboard())
      call.respond(HttpStatusCode.OK, response)
    }
  }
}
