package com.example.tmtalk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
class TmtalkApplication
fun main(args: Array<String>) {
    runApplication<TmtalkApplication>(*args)
}
