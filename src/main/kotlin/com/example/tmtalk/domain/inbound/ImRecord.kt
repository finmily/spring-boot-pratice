package com.example.tmtalk.domain.inbound

import com.fasterxml.jackson.annotation.JsonProperty

data class ImRecord(
    val from: Long,
    val to: Long,

    @JsonProperty("msg_id")
    val msgId: String,

    @JsonProperty("msg_type")
    val msgType: String,

    val content: String
)