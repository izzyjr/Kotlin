package academy.learnprogramming.oochallenge

fun main() {

    val bicycle = KotlinBicycle(1, 2, 3)
    bicycle.printDescription()
    val bicycle2 = KotlinMountainBike(1, 2, 3, 4)
    bicycle2.printDescription()
    val bicycle3 = KotlinRoadBike(1, 2, 3, 4)
    bicycle3.printDescription()

    println("*****************- With default gear -*************")

    val bicycle4 = KotlinBicycle(1, 2)
    bicycle4.printDescription()
    val bicycle5 = KotlinMountainBike(1, 2, 3)
    bicycle5.printDescription()
    val bicycle6 = KotlinRoadBike(1, 2, 3)
    bicycle6.printDescription()

    println("************- Class with Sencondary Constructor -**************")
    val bicycle7 = KotlinMountainBike("Blue",1, 2, 2)

    KotlinRoadBike.availableColors.forEach { println(it)}

}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("""Bike is in gear $gear 
                |with a cadence of $cadence 
                |traveling at a speed of $speed""".trimMargin())
    }

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
        KotlinBicycle(cadence, speed, gear) {
    constructor(color: String, cadence: Int, speed: Int, seatHeight: Int, gear: Int = 20):
            this(cadence, speed, gear, seatHeight){
       printDescription()
        println("Color is $color")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10):
        KotlinBicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
    // companion object. List<String> called availableColors
    // initialize the list to different colors and print
    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }
}


