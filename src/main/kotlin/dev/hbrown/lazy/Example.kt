package dev.hbrown.lazy

class Example {
    val heavyObject: HeavyObject by lazy {
        println("Creating heavy object...")
        HeavyObject()
    }
}
