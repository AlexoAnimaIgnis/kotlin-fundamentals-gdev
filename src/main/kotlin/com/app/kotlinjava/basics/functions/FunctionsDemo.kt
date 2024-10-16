package com.app.kotlinjava.basics.functions



fun main(args: Array<String>) {
}

fun memberReference() {

}

class PersonTestDemo(val name: String, val age: Int)

fun functionType() {

    val isEven: (Int) -> Boolean = { i: Int -> i % 2 == 0 } // the return type of isEven is (Int) -> Boolean
    println(isEven(10))

    // what is the difference between these two?
    // () -> Int? = return type is NULLABLE; not the whole type
    // (() -> Int)? = whole type is NULLABLE

    // EXAMPLE:

    // WRONG val f2: () -> Int? = null # Null cannot be a value of a non-null type () -> Int?
    val f2: () -> Int? = { null } // lambda without arguments that always return null
    println(f2())

    // working with a nullable function type
    val f:(() -> Int)? = null
    // how to call? by surrounding with a null checking
    if (f != null) {
        f()
    }
    // or
    f?.invoke()
}



/**
 * function declaration starts with the
 * 1. fun keyword
 * 2. name of the function `max`
 * 3. parameter (optional)
 * 4. return type optional
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}