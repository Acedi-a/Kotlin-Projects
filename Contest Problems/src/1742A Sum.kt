// https://codeforces.com/contest/1742/problem/A

fun main() {
    repeat(readLine()!!.toInt()) {
        val (a,b,c) = readLine()!!.split(' ').map { it.toInt() }
        if(a+b == c || a+c == b || b+c == a) println("YES")
        else println("NO")
    }
}