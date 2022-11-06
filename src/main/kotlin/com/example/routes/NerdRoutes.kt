package com.example.routes

import com.example.data.model.Nerd
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL ="http://192.168.1.2:8080"
private val nerds = listOf(
    Nerd("hassan1","the big nerd 1","$BASE_URL/nerd/hassan1.jpg"),
    Nerd("hassan2","the big nerd 2","$BASE_URL/nerd/hassan2.jpg"),
    Nerd("hassan3","the big nerd 3","$BASE_URL/nerd/hassan3.jpg"),
    Nerd("hassan4","the big nerd 4","$BASE_URL/nerd/hassan4.jpg"),
    Nerd("hassan5","the big nerd 5","$BASE_URL/nerd/hassan5.jpg"),
    Nerd("hassan6","the big nerd 6","$BASE_URL/nerd/hassan6.jpg"),
)

fun Route.randomNerd () {

    get("/randomnerd"){
        call.respond(
            HttpStatusCode.OK,
            nerds.random()
        )
    }
}