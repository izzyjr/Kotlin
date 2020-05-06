package academy.learnprogramming.elements

import academy.learnprogramming.elements.javacode.Challenges2

fun main() {

    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384
    val floatOne: Float = -3847.384f
    val floatTwo = -3847.384f

    // 2. Now change both of those variables declarations into nullable variables.
    val float3: Float? = -3847.384f
    val float4: Float? = -3847.384f

    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, and 5
//    val nums = ShortArray(5) {i -> i + 1}

    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val nullInts = Array<Int?>(40) {i: Int -> (i + 1) * 5}
    for (i in nullInts) {
        println(i)
    }

    // 5, You have to call a Java method with the following signature from Kotlin:
    // public void method (char[] charrArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'/

    val chars = charArrayOf('a', 'b', 'c')
    val javaCode = Challenges2().method(chars)

    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.
    val y = x?.toLowerCase() ?: "I give up!"

    // 7. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()


}