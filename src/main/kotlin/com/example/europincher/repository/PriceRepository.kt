package com.example.europincher.repository

import com.example.europincher.repository.model.Price
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.data.repository.kotlin.CoroutineSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface PriceRepository : CoroutineCrudRepository<Price, Long>, CoroutineSortingRepository<Price, Long>, PriceRepositoryR2dbc {
}