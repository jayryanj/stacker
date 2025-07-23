package dev.jayryanj.stacker.controller

import dev.jayryanj.stacker.dto.Stack
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class StackController {

    @GetMapping("/healthcheck")
    fun healthcheck() : String {
        return "Up"
    }

    @PostMapping("/stack")
    fun getStack() : ResponseEntity<Stack> {
        return ResponseEntity.status(HttpStatus.OK).body(Stack())
    }
}
