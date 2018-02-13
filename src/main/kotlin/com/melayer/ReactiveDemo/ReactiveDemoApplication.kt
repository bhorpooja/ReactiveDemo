package com.melayer.ReactiveDemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories


@SpringBootApplication
@EnableReactiveMongoRepositories
class ReactiveDemoApplication

    fun main(args: Array<String>) {
        SpringApplication.run(ReactiveDemoApplication::class.java, *args)
    }






