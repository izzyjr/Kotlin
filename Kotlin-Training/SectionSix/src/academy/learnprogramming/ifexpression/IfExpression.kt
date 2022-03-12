package academy.learnprogramming.ifexpression

fun main() {

    var num: Int
    var someCondition = false

    if (someCondition) {
        num = 50
    } else {
        num = 592
    }

    someCondition = 69 > 33
    num = if (someCondition) 50 else 592

    var x = if (someCondition) {
        println("Something")
        934
    } else  {
        println("Something else")
        234
    }
    println(x)

}