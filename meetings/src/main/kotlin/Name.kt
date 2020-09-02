package com.rsk

import java.lang.IllegalArgumentException

class Name {
    var name: String = ""
        set(value: String) {
            if (value.isNullOrBlank()) {
                throw IllegalArgumentException()
            }
            field = value
        }
}