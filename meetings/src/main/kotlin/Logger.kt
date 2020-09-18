package com.rsk

import java.nio.file.Path

interface Logger {
    fun debug(msg: String)
    fun warn(msg: String)
    fun info(msg: String) {
        warn(msg)
    }
}
