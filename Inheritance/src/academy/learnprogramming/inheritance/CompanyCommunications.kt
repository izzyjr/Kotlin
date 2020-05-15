package academy.learnprogramming.inheritance

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightline())

    SomeOtherClass().someOtherMethod()
    SomeClass.accessPrivateVar()

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLower("this isn't the string as is", false)
    println(someClass1.someOtherString)
    println(someClass2.someOtherString)

    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int) = "This is from mustImplement: ${num * 100}"
    })

}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightline() = "Copyright ® $currentYear Our Company. All rights reserved."

}

class SomeClass private constructor(val someOtherString: String) {

    companion object {
        val privateVar = 6

        fun accessPrivateVar() {
            println("I'm accessing privateVar: $privateVar")
        }

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLower(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }

    }

}

class SomeOtherClass {

    fun someOtherMethod() {
        SomeClass.accessPrivateVar()
    }

}