package com.example.tmtalk.controller

import com.example.tmtalk.domain.inbound.ImRecord
import com.mongodb.MongoClient
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RequestMapping("/history")
@RestController
class History(
    val mongoClient: MongoClient
) {

    @PostMapping
    fun addRecord(
        @RequestBody record: ImRecord
    ): String {
        return "hello"
    }

    @GetMapping
    fun listRecord(): Mono<ImRecord> {

        val mongoOps = MongoTemplate(mongoClient, "skills")

        return Mono.create()mongoOps.getCollection("im_records").find().limit(10)
    }
}