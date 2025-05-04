package ru.antoffy.backend

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    install(RoutingRoot) {
        route("/", HttpMethod.Get) {
            handle {
                call.respondText("Hello World 2!")
            }
        }
    }

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
