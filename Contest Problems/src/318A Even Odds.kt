// https://codeforces.com/problemset/problem/318/A

fun main() {
    val (n,s) = readLine()!!.split(" ").map {it.toLong()}
    val mid = (n+1) / 2
    val res = if ( s<=mid) (2*s)-1 else 2*(s-mid)
    println(res)
}