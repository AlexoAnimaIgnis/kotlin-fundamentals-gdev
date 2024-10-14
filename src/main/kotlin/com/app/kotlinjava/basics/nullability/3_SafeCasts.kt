package com.app.kotlinjava.basics.nullability

fun main(args: Array<String>) {
    val s = args
    println(s as? Int)    // null
    println(s as Int?)    // exception
}

fun safeCast(any: Any) {

    println(any as? Int)
    println(any as Int?)
}

/**
 * Summary
 * Type cast as throws ClassCastException, if the cast is unsuccessful.
 * Safe cast as?
 * returns null, if the cast is unsuccessful.
 * Declare the s variable to make the first line print null and the second one throw an exception.
 */
fun safeCasts(any: Any) {
    // is keyword is same as  instanceof in java
    // an example of type cast
    // type cast will throw an error if the expression cannot be cast
    if(any is String) {
        val  s = any as String
        s.toString()
    }

    // safe cast: as
    // an alternative to type cast
    // returns either the return type value or null as the result
    (any as? String)?.uppercase()

}