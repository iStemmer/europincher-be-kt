package com.example.europincher.service

import com.example.europincher.repository.StoreRepository
import com.example.europincher.repository.model.Store
import org.springframework.stereotype.Service
import kotlinx.coroutines.flow.Flow

@Service
class StoreService(private val storeRepository: StoreRepository) {

    suspend fun findById(id: Long): Store? {
        return storeRepository.findById(id)
    }

     fun findAll(): Flow<Store> {
        return storeRepository.findAll()
    }

}