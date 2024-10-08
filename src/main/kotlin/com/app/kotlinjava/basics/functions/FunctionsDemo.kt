package com.app.kotlinjava.basics.functions

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