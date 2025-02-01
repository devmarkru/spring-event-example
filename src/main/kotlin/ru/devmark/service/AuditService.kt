package ru.devmark.service

import ru.devmark.event.BusinessEvent

interface AuditService {

    fun onBusinessEvent(event: BusinessEvent)
}
