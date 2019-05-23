package com.example.tmtalk.configuration

import com.mongodb.MongoClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.data.mongodb.MongoDbFactory
import org.springframework.data.mongodb.config.AbstractMongoConfiguration
import org.springframework.data.mongodb.core.MongoTemplate

@Configuration
class MongoConfiguration : AbstractMongoConfiguration(

) {
    @Autowired
    lateinit var env: Environment
    override fun getDatabaseName(): String {
        return env.getProperty("mongo.db.name", "test")
    }

    override fun mongoClient(): MongoClient {
        return MongoDbFactory
    }
}