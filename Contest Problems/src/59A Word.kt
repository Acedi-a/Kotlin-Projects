// https://codeforces.com/problemset/problem/59/A

fun main() {
    val cad = readLine()!!
    if (cad.count{ it.isLowerCase()} >= cad.count{ it.isUpperCase() }) println(cad.lowercase())
    else println(cad.uppercase())
}