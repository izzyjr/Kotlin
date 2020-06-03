package academy.generics

fun main() {

    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    convertToInt2(shortList)

    val mutableShortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
//    convertToInt3(mutableShortList)



}

fun waterGarden(garden: Garden<Flower>) {

}

fun tendGarden(roseGarden: Garden<Rose>) {
//    waterGarden(roseGarden)
}

open class Flower {

}

class Rose: Flower() {

}

class Garden<T: Flower> {

}

fun convertToInt3(collection: MutableList<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun convertToInt2(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}
