package com.example.europincher.repository

import com.example.europincher.repository.model.Price
import kotlinx.coroutines.reactive.awaitFirst
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate
import org.springframework.data.relational.core.query.Criteria.*
import org.springframework.data.relational.core.query.Query.query
import org.springframework.stereotype.Repository

@Repository
class PriceRepositoryR2dbcImpl(
    private val template: R2dbcEntityTemplate
) : PriceRepositoryR2dbc {

    override suspend fun findByNameContainingIgnoreCase(
        name: String?,
        store: String?,
        pageable: Pageable
    ): Page<Price> {
        var criteria = empty()
        name?.let { criteria = criteria.and("name").like("%$name%").ignoreCase(true) }
        store?.let { criteria = criteria.and("store").like("%$store%").ignoreCase(true) }
        return template.select(Price::class.java)
            .matching(query(criteria).with(pageable))
            .all()
            .collectList()
            .map { PageImpl(it) }
            .awaitFirst()
    }

}