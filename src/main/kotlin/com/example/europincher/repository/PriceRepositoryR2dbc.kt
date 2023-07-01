package com.example.europincher.repository

import com.example.europincher.repository.model.Price
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository

@Repository
interface PriceRepositoryR2dbc {
    suspend fun findByNameContainingIgnoreCase(name: String?, store: String?, pageable: Pageable): Page<Price>

}