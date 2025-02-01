package ru.devmark.service

import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import ru.devmark.event.BusinessEvent

@Service
class AuditService {

    private val logger = LoggerFactory.getLogger(AuditService::class.java)

    @Async
    @EventListener(BusinessEvent::class)
    fun onBusinessEvent(event: BusinessEvent) {
        logger.info("Business event received: ${event.payload}.")
    }
}
