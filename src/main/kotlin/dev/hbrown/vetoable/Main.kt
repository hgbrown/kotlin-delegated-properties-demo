package dev.hbrown.vetoable

fun main() {
    val example = Example()
    example.age = 17
    println(example.age) // prints 0
    example.age = 18
    println(example.age) // prints 18
}
