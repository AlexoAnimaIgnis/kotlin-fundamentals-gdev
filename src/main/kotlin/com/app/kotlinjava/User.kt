package com.app.kotlinjava

data class User(var firstName: String?, var lastName: String?) // sample of primary constructor

fun main() {
    val user1 = User("Jane", "Doe") // declaring instance of class

    // two types of equality:
    val user2 = User("Jane", "Doe")

    val structuralEquality = user1 == user2 // true -> uses equals() to determine if two instancs are equal
    val referentialEquality = user1 === user2 // false -> checks if two references points to same address/object
    println("Result: structuralEquality: $structuralEquality and referentialEquality: $referentialEquality")
}