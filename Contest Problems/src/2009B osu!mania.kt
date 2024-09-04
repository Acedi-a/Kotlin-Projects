// https://codeforces.com/contest/2009/problem/B

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val t = readLine()!!.toInt()
        var res = mutableListOf<Int>()
        repeat(t) {
            val cad = readLine()!!
            val pos = cad.indexOf('#') +1
            res.add(pos)

        }
        res.reverse()
        println(res.joinToString(" "))

    }


}