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


/**
 * In Java, whenever you need some utility functionality, you would most likely create a Util class and declare that
 * functionality as a static function.
 *
 * In Kotlin you can declare top-level functions, without having a class.
 * However, Kotlin also provides the ability to create extension functions.
 * These are functions that extend a certain type but are declared outside of the type.
 */

// extension function
fun User.getFormattedName(): String {
    return if (lastName != null) {
        if (firstName != null) {
            "$firstName $lastName"
        } else {
            lastName ?: "Unknown"
        }
    } else {
        firstName ?: "Unknown"
    }
}

// extension property
val User.userFormattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName $lastName"
            } else {
                lastName ?: "Unknown"
            }
        } else {
            firstName ?: "Unknown"
        }
    }

// usage:
val user = User("Jane", "Doe")
val name = user.getFormattedName()
val formattedName = user.userFormattedName

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