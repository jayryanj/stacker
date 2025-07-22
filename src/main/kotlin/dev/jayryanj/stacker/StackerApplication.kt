package dev.jayryanj.stacker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StackerApplication

fun main(args: Array<String>) {
    runApplication<StackerApplication>(*args)
}
