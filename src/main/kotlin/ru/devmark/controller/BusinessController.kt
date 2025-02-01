package ru.devmark.controller

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ru.devmark.service.BusinessService

@RestController
class BusinessController(
    private val businessService: BusinessService,
) {

    @PostMapping("/{id}")
    fun create(@PathVariable id: Int): String {
        businessService.createObject(id)
        return "Объект с id = $id создан в системе!"
    }
}
