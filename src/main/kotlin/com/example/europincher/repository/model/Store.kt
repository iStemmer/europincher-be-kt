package com.example.europincher.repository.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class Store(
    @Id var id: Long,
    var name: String
)