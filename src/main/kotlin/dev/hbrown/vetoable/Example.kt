package dev.hbrown.vetoable

import kotlin.properties.Delegates.vetoable

class Example {
    var age: Int by vetoable(0) { _, _, newValue ->
        newValue >= 18
    }
}
