package com.melayer.ReactiveDemo.domain

import com.fasterxml.jackson.annotation.JsonInclude
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

import org.springframework.data.mongodb.core.mapping.Field

/**
 * Created by pooja on 10/2/18.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "student")
class Student {

    @Id val id:String?=null
    @Field val name:String?=null
    @Field val clg:String?=null
    @Field val address:String?=null
}