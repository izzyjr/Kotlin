package academy.learnprogramming.elements

fun main() {

    // Assigning a null value to a String variable in Kotlin
    // Results in: Null can not be a value of a non-null type String
    // unless data type name is followed by a question mark - made nullable
    val str: String? = "This ins't null"
    if (str != null) {
        str.toUpperCase()
    }

    // Safe Call Operator
    str?.toUpperCase()

    // When variable is null -> we don't get a null pointer exception
    val str2: String? = null
    println("What happens when we do this: ${str2?.toUpperCase()}")
    val str3 = str2 ?: "This is the default value"
    println(str3)
    val str4: String? = null
    var str5 = elvisOperator(str4)
    println(str5)

    val something: Any = arrayOf(1, 2, 3, 4, 5)
    val something2 = something as? String
    println(something2)

    val str6: String? = "This isn't null"
    val str7 = str6!!.toUpperCase()

    val str8: String? = null
    val str9 = str8?.toUpperCase()
    println(str9)

    val str10: String? = "This isn't null - 2.0"
    str10?.let { println(it) }


}

fun elvisOperator(assignee: String?): String {
    if (assignee == null) {
        return "This is the default value for this method"
    } else {
        return assignee
    }
}

