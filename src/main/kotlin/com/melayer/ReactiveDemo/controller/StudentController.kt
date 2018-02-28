package com.melayer.ReactiveDemo.controller

import com.melayer.Cashbolo.util.Constants.MESSAGE
import com.melayer.Cashbolo.util.Constants.RESULT
import com.melayer.Cashbolo.util.Constants.STATUS
import com.melayer.Cashbolo.util.Constants.SUCCESS
import com.melayer.ReactiveDemo.domain.Student
import com.melayer.ReactiveDemo.repository.StudentRepo
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

/**
 * Created by pooja on 10/2/18.
 */
@RestController
@RequestMapping("/student")
class StudentController(
        private val studentRepo:StudentRepo
) {
    private var map=HashMap<String,Any>()

    @PostMapping("/registerStudent")
    fun registerStudent(@RequestBody student: Student): ResponseEntity<*>? {
        map= HashMap()
        val stud= studentRepo.save(student)?.block()
        map[STATUS]= SUCCESS
        map[MESSAGE]="Student Register Successfully"
        map[RESULT]=stud!!
        return ResponseEntity.ok(map)
    }

    @GetMapping("/getAllStudents")
    fun getStudents(): ResponseEntity<*>? {
        map= HashMap()
        val students=studentRepo.findAll().collectList().block()
        map[STATUS]= SUCCESS
        map[RESULT]=students!!
        return ResponseEntity.ok(map)
    }

    @GetMapping("/getStudent/{id}")
    fun getStudent(@PathVariable id:String):ResponseEntity<*>?{
        map= HashMap()
        val student=studentRepo.findById(id).block()
        map[STATUS]= SUCCESS
        map[RESULT]=student!!
        return ResponseEntity.ok(map)
    }
}