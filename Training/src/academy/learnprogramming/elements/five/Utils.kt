package academy.learnprogramming.elements.five

class Utils {

    fun upperCaseFirstLast(string: String): String {
        val upperFirst = string.substring(0, 1).toUpperCase() + string.substring(1)
        return upperFirst.substring(0, upperFirst.length - 1) +
                upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
    }

}