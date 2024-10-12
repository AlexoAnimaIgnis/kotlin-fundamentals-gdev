package com.app.kotlinjava.collection

fun main() {
    val set = hashSetOf(1, 7, 5, 4)
    val list = arrayListOf(1, 4, 5)
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")

    // ** when you run the following,
    // we can see the classes of objects created here
    /**
     * This is a good sign for java developers
     * Kotlin doesnt have its own set of collection classes
     * all existing knowledge about java can be applied here
     *
     * No kotlin collection because it makes it easier to
     * interact with Java when we use the existing Java Collection
     * Framework.
     */
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    // default string implementation
    val strings = listOf("first", "second", "third")
    println(strings)
    /**
     * Even though Kotlin’s collections are exactly the same classes as Java col-lections, you can do much more with them in Kotlin.
     * For example, youcan get the last element in a list or find a maximum in a collection ofnumbers
     */
    println(strings.first())
    println(strings.last())
    println(setOf(1, 5, 78, 23, 2).max())
}