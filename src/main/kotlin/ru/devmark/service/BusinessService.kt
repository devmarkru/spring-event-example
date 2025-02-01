package ru.devmark.service

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import ru.devmark.event.ActionInfo
import ru.devmark.event.ActionType
import ru.devmark.event.BusinessEvent

@Service
class BusinessService(
    val publisher: ApplicationEventPublisher,
) {
    private val logger = LoggerFactory.getLogger(BusinessEvent::class.java)

    fun createObject(objectId: Int) {
        // бизнес-логика
        logger.info("Object with id = $objectId created.")

        val event = BusinessEvent(
            sourceObject = this,
            payload = ActionInfo(
                objectId = objectId,
                actionType = ActionType.CREATE,
            )
        )
        publisher.publishEvent(event)
        logger.info("Event sent.")
    }
}
