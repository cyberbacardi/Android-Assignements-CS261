package com.pes.lib

fun convert(names: Array<String?>): Array<String?> {
    val result = arrayOfNulls<String>(names.size)
    var index = 0

    for (name in names) {
        // explicit null check
        if(name != null) {
            println("$name")
        }

        // safe-call operator
        println("${name?.uppercase()}")

        // elvis operator
        val uppercase = name?.uppercase() ?: "UNKNOWN"
        println("with elvis operator: $uppercase")

        // assertion operator
        if(name != null) {
            val upper1 = name.uppercase()
            println("With assertion operator: $upper1")
        }

        var nameStr : String? = name
        nameStr = nameStr?.uppercase() ?: "UNKNOWN"
        result[index] = nameStr
        index++

        println("DONE")
    }

    return result
}

fun main(){
    convert(names= arrayOf("john", null, "merry", "robert"))
}