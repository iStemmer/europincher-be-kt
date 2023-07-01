package com.example.europincher.service

import com.example.europincher.repository.PriceRepository
import com.example.europincher.repository.PriceRepositoryR2dbc
import com.example.europincher.repository.model.Price
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PriceService(private val priceRepository: PriceRepository) {

    suspend fun findById(id: Long): Price? {
        return priceRepository.findById(id)
    }

    suspend fun findByNameContainingIgnoreCase(name: String?, store: String?, pageable: Pageable) : Page<Price> {
        return priceRepository.findByNameContainingIgnoreCase(name, store, pageable)
    }

}