package academy.learnprogramming.collections

fun main() {

    val strings = listOf("spring", "summer", "fall", "winter", "summer")
    val colorList = listOf("Brown", "Blue", "Green", "Green", "Brown")

    // Changing an immutable list to a mutable list
    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("KillaSeason")
    println(mutableSeasons)

    // get last element in a list
    println(strings.last())

    // reversing a string
    println(strings.asReversed())

    // Only get an item if there is an item at the provided index else return null
    println(strings.getOrNull(5))

    // get maximum value in a collection
    val ints = listOf(1, 2, 3, 4, 5, 6)
    println(ints.max())

    // join two collections together in pairs
    println(colorList.zip(strings))

    // List of lists
    val mergedLists = listOf(colorList, strings)
    println(mergedLists)

    // Combining two lists with concatination
    val combinedlist = colorList + strings
    println(combinedlist)

    // Combine two lists without duplicate items
    val noDuplicatesList = colorList.union(strings)
    println(noDuplicatesList)

    // Removing duplicates from a list
    val noDuplicateColors = colorList.distinct()
    println(noDuplicateColors)



}