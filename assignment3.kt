package com.pes.lib

fun main(){
    val phoneNumbers = listOf<String>("1234567890", "123", "", "9876543221")

    // Task 1: using lambda, filter valid phone numbers – 10 digits
    val validPhones = phoneNumbers.filter { it.length == 10 }
    println("Valid phone numbers: $validPhones")

    // Task 2: using lambda, print all phone numbers, if invalid – print 'NAN'
    phoneNumbers.forEach { phone ->
        if(phone.length == 10) {
            println(phone)
        } else {
            println("NAN")
        }
    }

    // Alternative using map()
    println("\nUsing map():")
    phoneNumbers.map { phone ->
        if(phone.length == 10) phone else "NAN"
    }.forEach { println(it) }
}