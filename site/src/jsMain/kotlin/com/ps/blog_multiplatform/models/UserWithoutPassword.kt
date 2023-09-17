package com.ps.blog_multiplatform.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
actual data class UserWithoutPassword(
    @SerialName(value = "_id")
    actual val id: String = "",
    actual val username: String = ""
)