package dev.hbrown.lazy

fun main() {
    val example = Example()
    println("Accessing heavy object for the first time...")
    val obj1 = example.heavyObject
    println("Accessing heavy object for the second time...")
    val obj2 = example.heavyObject
}
