package co.uk.basedapps.vpn.server.routers

import co.uk.basedapps.vpn.network.model.Credentials
import co.uk.basedapps.vpn.server.error.HttpError.Companion.badRequest
import co.uk.basedapps.vpn.server.models.TunnelStatusResponse
import co.uk.basedapps.vpn.vpn.VPNConnector
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.routing

fun Application.routeVpn(
  vpnConnector: VPNConnector,
) {

  routing {
    post("/api/connect") {
      val request = kotlin.runCatching { call.receive<Credentials>() }.getOrNull() ?: let {
        return@post call.respond(HttpStatusCode.BadRequest, badRequest)
      }

      val result = vpnConnector.connect(request)
      call.respond(HttpStatusCode.OK, TunnelStatusResponse(result.isRight))
    }

    post("/api/disconnect") {
      vpnConnector.disconnect()
      call.respond(HttpStatusCode.OK, TunnelStatusResponse(false))
    }

    get("/api/status") {
      call.respond(HttpStatusCode.OK, TunnelStatusResponse(vpnConnector.isConnected()))
    }
  }
}