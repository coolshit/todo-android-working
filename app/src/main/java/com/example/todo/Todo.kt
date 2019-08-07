package com.example.todo

import java.time.LocalDateTime

/**
 * Data model class
 */
data class Todo(val id: Long, val description: String, val createdAt: LocalDateTime, val status: TodoStatus)
