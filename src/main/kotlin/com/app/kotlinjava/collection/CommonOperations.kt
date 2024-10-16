package com.app.kotlinjava.collection

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE)
    )

    // map = transform elements from one type to another
    // any = checks at least one elements that satisfy the predicate (all, none)
    // find = find element that satisfy the given predicate
    // first or firstOrNull
    // count


    // groupBy
    // associateBy = removes duplicate
    // associate = build map based on a list
    // zip
    // zipWithNext
    // flatten
    // flatMap = combines flat and map
}

fun commOperations1(heroes: List<Hero>) {

    println("heroes.first().name Result: ${heroes.first().name}")
    println("heroes.firstOrNull().name Result: ${heroes.firstOrNull()?.name}")
    println("heroes.last().name Result: ${heroes.last().name}")
    println("heroes.lastOrNull().name Result: ${heroes.lastOrNull()?.name}")

    // heroes age 30
    println("heroes.firstOrNull() Result: ${heroes.firstOrNull { it.age == 30 }?.name}")

    // distinct
    println("heroes.distinct() Result: ${heroes.map { it.age }.distinct().size}")

    // filter is used to retain elements that satisfy the given predicate
    println("heroes.filter() Result: ${heroes.filter { it.age < 30 }.size}")


    // partition = divides collection into groups/collections
    val (youngest, oldest) = heroes.partition { it.age < 30 }

    println("Oldest: $oldest")
    println("Oldest partition: ${oldest.size}")
    println("Youngest: $youngest")
    println("Youngest partition: ${youngest.size}")

    // maxBy
    println("Max By Result: ${heroes.maxBy { it.age }?.name}")

    // all -> we check if all heroes are younger than 50
    println("predicate ALL  Result: ${heroes.all { it.age < 50 }}")

    // any -> we check if any heroes is FEMALE
    println("predicate ALL  Result: ${heroes.any { it.gender == Gender.FEMALE }}")
}