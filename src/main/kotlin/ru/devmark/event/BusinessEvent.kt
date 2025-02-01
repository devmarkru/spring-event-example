package ru.devmark.event

import org.springframework.context.ApplicationEvent

data class BusinessEvent(
    val sourceObject: Any,
    val payload: String,
): ApplicationEvent(sourceObject)
