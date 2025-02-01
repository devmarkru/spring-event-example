package ru.devmark.event

import org.springframework.context.ApplicationEvent

data class BusinessEvent(
    val sourceObject: Any,
    val payload: ActionInfo,
) : ApplicationEvent(sourceObject)

data class ActionInfo(
    val objectId: Int,
    val actionType: ActionType,
)

enum class ActionType {
    CREATE,
    UPDATE,
    DELETE,
}
