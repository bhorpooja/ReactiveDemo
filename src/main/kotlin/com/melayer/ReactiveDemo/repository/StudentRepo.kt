package com.melayer.ReactiveDemo.repository

import com.melayer.ReactiveDemo.domain.Student
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

/**
 * Created by pooja on 10/2/18.
 */
interface StudentRepo :ReactiveMongoRepository<Student,String>{
}