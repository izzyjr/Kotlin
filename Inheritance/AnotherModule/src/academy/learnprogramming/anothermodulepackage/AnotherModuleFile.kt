package academy.learnprogramming.anothermodulepackage

import academy.learnprogramming.inheritance.Department
import academy.learnprogramming.inheritance.Department.ACCOUNTING
import academy.learnprogramming.inheritance.SpecialLaserPrinter
import academy.learnprogramming.inheritance.addNum
import academy.learnprogramming.inheritance.topLevel
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
}