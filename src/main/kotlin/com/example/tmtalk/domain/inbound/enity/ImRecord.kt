package com.example.tmtalk.domain.inbound.enity

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.mongodb.core.mapping.Document

@Document("im_records")
data class ImRecord (
    val from: Long,
    val to: Long,

    @JsonProperty("msg_id")
    val msgId: String,

    @JsonProperty("msg_type")
    val msgType: String,

    val content: String
)