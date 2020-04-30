package academy.learnprogramming.challenge1

fun main() {

    // Declare two immutable String variables called hello1 and hello2. Assign "Hello"
    // to both variables

    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code, test whether hello1 and hello2 are referentially/structurally equal
    // and print the result

    val result = hello1 == hello2
    val result2 = hello1 === hello2
    println("$result - $result2")

    // Declare a mutable variable of type int and assign it the value 2988

    var number = 2988

    // Declare an immutable variable of type Any and assign it the string "The Any type
    // is the root of the Kotlin class hierarchy". Then, using a smart cast, print out
    // the uppercased string

    val variable: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (variable is String) {
        println(variable.toUpperCase())
    }

    // Using one line of code, print out the following. Make sure your code is nicely
    // indented

    //     1
    //    11
    //   111
    //  1111

    val x = """      1
        |     11
        |    111
        |   1111  
    """.trimMargin()

    println(x)

}