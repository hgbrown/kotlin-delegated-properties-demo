package dev.hbrown.custom

import kotlin.reflect.KProperty

class CustomDelegate {
    private var value = ""

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("Getting value for ${property.name}")
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
        println("Setting value for ${property.name} to $newValue")
        value = newValue
    }
}
