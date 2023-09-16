package com.ps.blog_multiplatform.data

import com.ps.blog_multiplatform.models.User

interface MongoRepository {
    suspend fun checkUserExistence(user: User): User?
}