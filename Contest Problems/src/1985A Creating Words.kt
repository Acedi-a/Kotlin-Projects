// https://codeforces.com/contest/1985/problem/A

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val (a,b) = readLine()!!.split(" ")
        val na = b[0] + a.substring(1)
        val nb = a[0] + b.substring(1)
        println(na+" "+nb)
    }
}

