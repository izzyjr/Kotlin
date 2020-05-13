package academy.learnprogramming.inheritance

fun main() {

    val laserPrinter = LaserPrinter("Brother 1234", 45)
    laserPrinter.printModel()

    SomethingElse("Whatever")

}

open class Something {

    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}

class SomethingElse: Something {

    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }

}

abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {

    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99

}

class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName, 22) {

}