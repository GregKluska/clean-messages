package com.gregkluska.cleanmessenger.business.domain.model

data class Group(
        val id: String,
        val name: String,
        val image: String,
        val last_message: Message?,
        val members: List<GroupMember>,
        val is_muted: Boolean,
        val created_by: String,
        val created_at: String,
        val updated_at: String
)