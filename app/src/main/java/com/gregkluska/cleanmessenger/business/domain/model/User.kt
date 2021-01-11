package com.gregkluska.cleanmessenger.business.domain.model

data class User(
        val id: String,
        val first_name: String,
        val last_name: String,
        val dob: String,
        val photo: String
)