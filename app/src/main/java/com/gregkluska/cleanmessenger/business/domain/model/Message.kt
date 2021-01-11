package com.gregkluska.cleanmessenger.business.domain.model

data class Message(
        val id: String,
        val sent_by: String,
        val sent_at: String,
        val content: String
)