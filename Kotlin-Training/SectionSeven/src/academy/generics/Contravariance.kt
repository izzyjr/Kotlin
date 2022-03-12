package academy.generics

fun main() {

    // With Contravariance We don't need an instance of care taker for every Animal
    val pantherCareTaker = object : AnimalCare<Panther> {
        override fun groom(animal: Panther) {
            println("I'm grooming a Panther!")
        }
    }

    val condorCareTaker = object : AnimalCare<Condor> {
        override fun groom(animal: Condor) {
            println("I'm grooming a Condor!")
        }
    }

    val animalCareTaker = object : AnimalCare<Animal> {
        override fun groom(animal: Animal) {
            println("I'm grooming an ${animal.name}!")
        }
    }

    val pantherZoo: Zoo<Panther> = Zoo(listOf(Panther("Jaws"), Panther("Dark")), animalCareTaker)
    pantherZoo.careForAnimal(0)

    val condorZoo: Zoo<Condor> = Zoo(listOf(Condor("Wind"), Condor("Jet")), animalCareTaker)
    condorZoo.careForAnimal(1)

}

class Zoo<T: Animal>(val animals: List<T>, val animalCare: AnimalCare<T>) {
    fun showAnimal(i: Int) = animals[i]
    fun careForAnimal(i: Int) {
        animalCare.groom(animals[i])
    }
}

open class Animal(val name: String) {

}

class Panther(name: String) : Animal(name) {

}

class Condor(name: String): Animal(name) {

}

interface AnimalCare<in T> {
    fun groom(animal: T)
}

