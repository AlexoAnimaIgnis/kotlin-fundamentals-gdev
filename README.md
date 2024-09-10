# kotlin-fundamentals
Kotlin Fundamentals 



* In Java, whenever you need some utility functionality, you would most likely create a Util class and declare that
* functionality as a static function.
*
* In Kotlin you can declare top-level functions, without having a class.
* However, Kotlin also provides the ability to create extension functions.
* These are functions that extend a certain type but are declared outside of the type.


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

