package com.melayer.ReactiveDemo.repository

import com.melayer.ReactiveDemo.domain.Student
import org.reactivestreams.Publisher
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

/**
 * Created by pooja on 10/2/18.
 */
interface StudentRepo :ReactiveMongoRepository<Student,String>{

    override fun findAll():Flux<Student>

    override fun findById(id: String): Mono<Student>
}