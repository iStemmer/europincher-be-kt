package com.example.europincher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.config.CorsRegistry


@SpringBootApplication
class EuropincherBeKtApplication

fun main(args: Array<String>) {
    runApplication<EuropincherBeKtApplication>(*args)
}
