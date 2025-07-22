package dev.jayryanj.stacker.controller

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
    fun stack() : ResponseEntity<String> {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("Not yet implemented")
    }
}
