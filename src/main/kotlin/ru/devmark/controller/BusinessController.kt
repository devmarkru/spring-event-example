package ru.devmark.controller

import org.springframework.context.ApplicationEventPublisher
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ru.devmark.event.BusinessEvent

@RestController
class BusinessController(
    val publisher: ApplicationEventPublisher,
) {

    @PostMapping
    fun create() {
        // бизнес-логика

        val event = BusinessEvent(
            sourceObject = this,
            payload = "Some information"
        )
        publisher.publishEvent(event)
    }
}
