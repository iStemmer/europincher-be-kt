package com.example.europincher.controller

import com.example.europincher.repository.model.Price
import com.example.europincher.service.PriceService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*

@RestController("prices")
@RequestMapping("prices")
class PriceController(
    private val priceService: PriceService
) {

    @GetMapping("/search")
    suspend fun getPricesByName(
        @RequestParam name: String?,
        @RequestParam(name = "store") store: String?,
        @RequestParam(name = "page", defaultValue = "0") page: Int,
        @RequestParam(name = "size", defaultValue = "10") size: Int,
    ): Page<Price> {
        return priceService.findByNameContainingIgnoreCase(name, store, PageRequest.of(page, size))
    }

    @GetMapping("{id}")
    suspend fun getPricesById(@PathVariable id: Long): Price? {
        return priceService.findById(id)
    }

}