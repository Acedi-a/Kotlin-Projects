// https://codeforces.com/contest/1999/problem/A

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        var m = readLine()!!.toInt()
        var sum = 0
        while (m >= 1) {
            sum += m % 10
            m /= 10
        }
        println(sum)
    }

}