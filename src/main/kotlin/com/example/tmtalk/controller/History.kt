package com.example.tmtalk.controller

import com.example.tmtalk.domain.inbound.ImRecord
import com.mongodb.MongoClient
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@RequestMapping("/history")
@RestController
class History {

    @PostMapping
    fun addRecord(
        @RequestBody record: ImRecord
    ): String {
        return "hello"
    }

    @GetMapping
    fun listRecord(): Any? {

        val mongoOps = MongoTemplate(MongoClient(), "skills")

        return mongoOps.getCollection("im_records").find().limit(10)
    }
}