package ru.devmark.service

import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service
import ru.devmark.event.BusinessEvent

@Service
class AuditServiceImpl : AuditService {

    private val logger = LoggerFactory.getLogger(AuditServiceImpl::class.java)

    @EventListener(BusinessEvent::class)
    override fun onBusinessEvent(event: BusinessEvent) {
        logger.info("Business event received: $event")
    }
}
