package com.amrhal.kotlintest

class User {

    var name: String = ""
        get() = field
        set(value) {

            if (value.startsWith("mr")) field = value
            else field = "Mr." + value
        }
companion object {
    val a4 = "test companion object "
    fun Create():User= User() //factory pattern

}

}
