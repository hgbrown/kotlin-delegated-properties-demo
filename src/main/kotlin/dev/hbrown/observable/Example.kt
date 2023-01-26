package dev.hbrown.observable

import kotlin.properties.Delegates.observable

class Example {
    var name: String by observable("") { _, oldValue, newValue ->
        println("Name changed from [$oldValue] to [$newValue]")
    }
}



