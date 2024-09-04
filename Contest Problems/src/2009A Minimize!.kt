// https://codeforces.com/problemset/problem/2009/A

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val (a,b) = readLine()!!.split(" ").map {it.toInt()}
        println(b-a)
    }

}