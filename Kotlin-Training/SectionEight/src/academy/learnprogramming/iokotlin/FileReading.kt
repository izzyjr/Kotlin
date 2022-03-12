package academy.learnprogramming.iokotlin

import java.io.File

fun main() {

    val lines = File("testfile.txt").reader().readLines()
    lines.forEach { println(it) }

    val reader = File("./src/academy/learnprogramming/iokotlin/testfile2.txt").reader()
    val lines2 = reader.readText()
    println(lines2)
    reader.close()

    val lines3 = File("testfile.txt").reader().use { it.readText() }
    println(lines3)

    val lines4 = File("testfile.txt").bufferedReader().use { it.readText() }
    println(lines4)

    val lines5 = File("./src/academy/learnprogramming/iokotlin/testfile2.txt").readText()
    println(lines5)

    File("testfile.txt")
        .reader().forEachLine { println(it) }

    File("testfile.txt")
        .reader().useLines { it.forEach { println(it) } }

}