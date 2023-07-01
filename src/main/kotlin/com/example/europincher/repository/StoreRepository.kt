package com.example.europincher.repository

import com.example.europincher.repository.model.Store
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.data.repository.kotlin.CoroutineSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface StoreRepository : CoroutineSortingRepository<Store, Long>, CoroutineCrudRepository<Store, Long> {
     fun findByName(name: String): Flow<Store>
}