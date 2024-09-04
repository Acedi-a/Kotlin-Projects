// https://codeforces.com/problemset/problem/1996/A

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        var t = readLine()!!.toInt()
        var cont = 0

        if (t % 4 == 0 ) cont = t/4
        else if ( t % 4 == 2 && t>=4) cont = t/4+1
        else cont = t/2

        println(cont)
    }
}