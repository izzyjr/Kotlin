package academy.learnprogramming.datatypes

fun main() {

    val myInt = 10
    var myLong = 22L

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    var myDouble = 65.45
    println(myDouble is Double)

    val myfloat = 838.345f
    println("$myfloat is a float: ${myfloat is Float}")

    val char = 'b'
    val myCharInt = 65
    println(myCharInt.toChar())

    val anything: Any




}