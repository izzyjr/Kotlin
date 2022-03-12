package academy.learnprogramming.collections

fun main() {

    val immutableSetInts = setOf(10, 15, 19, 5, 3, -22)
    // odd integers only
    println(immutableSetInts.filter { it % 2 != 0 })

    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
                        2 to Car("red", "Ford", 2016),
                        3 to Car("silver", "Honda", 2013))

    println(immutableMap.filter { it.value.year == 2016 })

    val mutableMap = mutableMapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Chevy", 2013))

    println(mutableMap.filter { it.value.color == "silver" })

    val redCarsOnlyMap = mutableMap.filter { it.value.color == "red" }
    println(redCarsOnlyMap)
    println(mutableMap)

    val carYears: MutableList<Int> = mutableListOf()
    mutableMap.map { carYears.add(it.value.year) }
    println("Car years: $carYears")
    println(carYears.javaClass)

    // Chaining Map and Filter

    val carMap = mutableMapOf<Int, Car>(1 to Car("pink", "BMW", 1987),
        3 to Car("black", "Ford", 1999),
        10 to Car("black", "Subaru", 1995),
        27 to Car("yellow", "Mini Cooper", 1970),
        6 to Car("red", "Ferrari", 2020),
        9 to Car("black", "Audi", 2013),
        100 to Car("burgundy", "Nissan", 2002))

    val oldCars: MutableMap<Int, Car> = mutableMapOf()
     carMap.filter { it.value.year < 2000 }
        .mapValues {
            oldCars.put(it.key, it.value)
        }
    println("Old Cars: $oldCars")
    println(oldCars.javaClass)

    println(carMap.filter { it.value.color == "black" }
        .map { it.value.model})

    println(carMap.all { it.value.year > 2000 })
    println(carMap.any { it.value.year < 2000 })
    println(carMap.count { it.value.year < 2000 })

    val cars = carMap.values
    println(cars.find { it.year < 2000 })

    val groupedByColor = cars.groupBy { it.color }
    println(groupedByColor.get("black")!!.get(0).color)
    println(groupedByColor.get("pink")!!.get(0).year)
    println((groupedByColor["black"] ?: error("")).map { it.year })

    println(carMap)
    println(carMap.toSortedMap())
    println(cars.sortedBy { it.color })



    val ints = arrayOf(1, 2, 3, 4, 5)
    val add20List: MutableList<Int> = mutableListOf()
    for (n in ints) {
        add20List.add(n + 20)
    }
    println(add20List)

    val add30List = add20List.map { it + 30 }
    println(add30List)

}

data class Car(val color: String, val model: String, val year: Int) {

}