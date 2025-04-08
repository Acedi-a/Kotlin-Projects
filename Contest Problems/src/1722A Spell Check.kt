// https://codeforces.com/contest/1722/problem/A

fun main() {
    val pal = "Timur"
    val pO = pal.toList().sorted().joinToString("")
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        var cad = readLine()!!
        val cO =cad.toList().sorted().joinToString("")
        //println(cO+" = "+pO)
        if (pO == cO) println("YES")
        else println("NO")
    }
}