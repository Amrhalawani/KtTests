package com.amrhal.kotlintest

class User {

    var name:String = ""
    get() = field
    set(value) {

        if (value.startsWith("mr")) field = value
        else field = "Mr." + value
    }

}