package com.melayer.ReactiveDemo.controller

import com.melayer.ReactiveDemo.domain.Student
import com.melayer.ReactiveDemo.repository.StudentRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by pooja on 10/2/18.
 */
@RestController
@RequestMapping("/student")
class StudentController {

    @Autowired
    private val studentRepo:StudentRepo? = null

    @PostMapping("/registerStudent")
    fun registerStudent(@RequestBody student: Student): Student {
       val stud= studentRepo?.save(student)?.block()
        return stud!!
    }
}