package kotlincode

class IsLucky {

    fun isLucky(n: Int): Boolean {
        val str: String = n.toString()
        val half: Int = (str.length / 2) - 1
        var a: Int = 0
        var b: Int = 0
        for (i in str.indices) {
            if (i <= half) {
                a += str[i].toString().toInt()
            } else {
                b += str[i].toString().toInt()
            }
        }
        if (a == b) {
            return true
        }
        return false
    }

}