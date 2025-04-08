// https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/kotlin

fun maps(x: IntArray): IntArray = x.map { it * 2 }.toIntArray()

fun main() {
    val n =  intArrayOf(1, 2, 3);
    println(maps(n))
}