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
        get("blogs/{id}") {
            val id = call.pathParameters["id"]
            val q1 = call.queryParameters["q1"]
            val q2 = call.queryParameters["q2"]
            call.respondText("Blog with id : $id & query1 $q1 & query2 $q2   ")
        }

        get(Regex(".+/test")) {
            call.respondText("Test Api Response")
        }
    }
}
