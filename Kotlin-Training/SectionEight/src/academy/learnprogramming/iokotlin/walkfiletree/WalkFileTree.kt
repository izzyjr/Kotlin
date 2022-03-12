package academy.learnprogramming.iokotlin.walkfiletree

import java.io.File

fun main() {

    File(".").walkTopDown()
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }

}