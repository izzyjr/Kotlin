package academy.learnprogramming.anothermodulepackage

import academy.learnprogramming.inheritance.*
import academy.learnprogramming.inheritance.Department.ACCOUNTING
import academy.learnprogramming.inheritance.SomeOtherClass as aka


fun main() {
    aka().someOtherMethod()
    topLevel("Hello from another Module")
    val classFromAnotherMofule = SpecialLaserPrinter("printer123")
    classFromAnotherMofule.printModel()
    val oneEnum = ACCOUNTING.fullName
    println(oneEnum)
    println(Department.SALES.numEmployees)
    var y = 6
    y = y.addNum(4)
    println(y)
    CompanyCommunications.getTagLine()
    // Can't be used within another Module because function signature is declared as Internal
    // CompanyCommunications.getCopyrightline()
}