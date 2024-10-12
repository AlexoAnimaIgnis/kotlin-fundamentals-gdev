package com.app.kotlinjava.collection

import java.lang.StringBuilder

/**
 * Generic function that works on collections
 * that contains any data type.
 * v.1
 * Note: This is still verbose.
 */
/**
 * v2
 *
 * In Kotlin, you can often avoid creating overloads because you can specify default values for parameters in a function declaration.
 * Let’s use that to improve the joinToString function.
 */
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postFix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postFix)
    return result.toString()
}

/**
 * overabundance of overloaded method in some classes.
 */


fun main() {
    val list = listOf(1, 2, 3)

    /**
     * When using the regular call syntax, you have to specify the arguments in the same order as in the function declaration, and
     * you can omit only trail-ing arguments.
     */
    println(joinToString(list, "; ", "(", ")"))
    /**
     * When calling a function written in Kotlin, you can specify the names ofsome arguments that you’re passing to the function.
     * If you specify the name of an argument in a call, you should also specify the names for allthe arguments after that, to avoid
     * confusion
     */
    println(joinToString(list, prefix = "(", separator = ";", postFix = ")"))

    println(joinToString(list))
    println(joinToString(list,"; "))
}