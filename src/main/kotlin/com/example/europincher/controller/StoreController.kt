package com.example.europincher.controller

import com.example.europincher.repository.model.Store
import com.example.europincher.service.StoreService
import kotlinx.coroutines.flow.Flow
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("stores")
class StoreController(
    private val storeService: StoreService
) {
    @GetMapping("{id}")
    suspend fun getStoreById(@PathVariable id: Long): Store? {
        return storeService.findById(id)
    }

    @GetMapping()
    fun getStores(): Flow<Store> {
        return storeService.findAll()
    }

}