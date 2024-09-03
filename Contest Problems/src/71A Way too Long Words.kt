// https://codeforces.com/problemset/problem/71/A

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val pal = readLine()!!
        val tam = pal.length
        if ( tam > 10) println(pal[0] + (tam-2).toString() + pal[tam-1])
        else println(pal)
    }
}