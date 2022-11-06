package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Nerd(
    val name: String,
    val description: String,
    val imageUrl: String
)