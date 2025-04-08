// https://codeforces.com/contest/1926/problem/A

fun main() {
    repeat(readLine()!!.toInt()) {
        val cad = readLine()!!
        val let = if (cad.count {it == 'A' } > cad.count{ it=='B' }) "A" else "B"

        println(let)
    }
}