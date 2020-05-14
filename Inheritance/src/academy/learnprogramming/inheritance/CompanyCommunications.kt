package academy.learnprogramming.inheritance

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightline())
}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightline() = "Copyright ® $currentYear Our Company. All rights reserved."

}