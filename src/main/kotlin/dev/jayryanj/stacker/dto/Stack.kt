package dev.jayryanj.stacker.dto

data class Stack(
    val frontend: List<String>? = null,
    val backend: List<String>? = null,
    val database: List<String>? = null,
    val hosting: List<String>? = null,
    val tools: List<String>? = null,
)