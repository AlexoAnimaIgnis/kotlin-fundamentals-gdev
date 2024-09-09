package com.app.kotlinjava

/**
 * named argument and null value follows a precedent in kotlin.
 * if the first parameter has null as a default value and last name does not, default parameter would precede
 * a parameter with no default value and must call the function with named arguments
 * example?\:
 * data class User(var firstName: String? = null, var lastName: String?)
 *
 * should be called as
 * // usage
 * val jane = User(lastName = "Doe") // same as User(null, "Doe")
 * val john = User("John", "Doe")
 */
data class User(var firstName: String?, var lastName: String? = null) // sample of primary constructor

fun main() {
    val user1 = User("Jane", "Doe") // declaring instance of class

    // two types of equality:
    val user2 = User("Jane", "Doe")

    val structuralEquality = user1 == user2 // true -> uses equals() to determine if two instancs are equal
    val referentialEquality = user1 === user2 // false -> checks if two references points to same address/object
    println("Result: structuralEquality: $structuralEquality and referentialEquality: $referentialEquality")

    val jane = User("Jane") // same as User("jane", null) as it has already a value
    val john = User(lastName="Smith", firstName = "Will") // named arguments


}