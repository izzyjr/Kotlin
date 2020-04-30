package academy.learnprogramming.elements

fun main() {

    val eggname = "Humpty"
    val filepath = """c:\somedir\somedir2"""
    val nurseryRhyme = """$eggname Dumpty sat on the wal 
        |$eggname Dumpty had a great fall
        |All the king's horses and all the king's men
        |Couldn't put $eggname together again. 
    """.trimMargin()

    val nurseryRhyme2 = """Humpty Dumpty sat on the wal 
        Humpty Dumpty had a great fall
        All the king's horses and all the king's men
        Couldn't put Humpty together again. 
    """
    
    println(nurseryRhyme)
    println(nurseryRhyme2)

}