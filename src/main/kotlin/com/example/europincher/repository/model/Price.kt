package com.example.europincher.repository.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class Price(
    @Id var id: Long,
    var name: String,
    var unitInfo: String?,
    var price: Double,
    var usualPrice: Double,
    var discount: String?,
    var description: String,
    var url: String,
    var image: String,
    var categories: String,
    var store: String
)
