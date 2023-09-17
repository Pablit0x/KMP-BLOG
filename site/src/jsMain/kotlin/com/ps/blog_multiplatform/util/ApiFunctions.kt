package com.ps.blog_multiplatform.util

import com.ps.blog_multiplatform.models.User
import com.ps.blog_multiplatform.models.UserWithoutPassword
import com.varabyte.kobweb.browser.api
import kotlinx.browser.window
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

suspend fun checkUserExistence(user: User): UserWithoutPassword? {
    return try {
        val result = window.api.tryPost(
            apiPath = "usercheck",
            body = Json.encodeToString(user).encodeToByteArray()
        )
        Json.decodeFromString<UserWithoutPassword>(result.toString())
    } catch (e: Exception) {
        println(e.message)
        null
    }
}