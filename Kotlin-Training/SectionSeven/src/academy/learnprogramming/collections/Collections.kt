package academy.learnprogramming.collections

fun main() {

    // Immutable Lists

    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)

    val emptyList: List<String> = emptyList<String>()
    println(emptyList.javaClass)

    if (emptyList.isNotEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("Hello", null, "GoodBye")
    println(notNullList.javaClass)

    // converting an array to a list in Kotlin w/ spread operator
    val array = arrayOf("black", "white", "green")
    val colorList = listOf(*array)
    println(colorList)

    // converting an array to a list in Kotlin w/ toList function
    val array2 = arrayOf("Red", "Blue", "Yellow")
    val colorList2 = array2.toList()
    println(colorList2)

    // Mutable Lists

    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList.javaClass)

    arrayList.add(0,4)
    arrayList[1] = 7

    val mutableList = mutableListOf(7, 6, 5)
    println(mutableList.javaClass)

    mutableList.add(2,9)
    mutableList[1] = 8

    // converting an array to a list in Kotlin w/ toMutableList function
    val array3 = arrayOf("Red", "Blue", "Yellow")
    val colorList3 = array2.toMutableList()
    colorList3.add(2,"Purple")
    colorList3[1] = "Pink"
    println(colorList3)

}