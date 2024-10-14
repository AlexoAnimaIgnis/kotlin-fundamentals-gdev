package com.app.kotlinjava.functionalprog.lambdas

fun main() {
    lambdaDemo2()
}

fun lambdaDemo2() {
    val map1 = mapOf(1 to "one", 2 to "two")

    // If your Lambda takes a pair of values as an argument or as in this case map entry,
    // you can use so-called destructuring syntax
    val res1 = map1.mapValues { entry -> "${entry.key} -> ${entry.value}" }
    val res2 = map1.mapValues { (key, value) -> "$key -> $value" }
    val res3 = map1.mapValues { (_, value) -> " $value" }

    println(res1)
    println(res2)
    println(res3)
}

fun lambdaDemo1() {
    val l1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val lambda1 = { x: Int, y: Int -> x + y }

    println(lambda1(1, 2)) // expecting 3

    val lambda2 = { x: Int -> x > 3 }
    println(l1.any({ x: Int -> x > 3 }))

    // can be improved
    println(l1.any { x: Int -> x > 3 })

    // can be improved if the argument can be inferred
    println(l1.any { it > 3 })

    l1.any {
        println("processing $it")
        it > 3
    }
}