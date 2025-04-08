// https://www.codewars.com/kata/53da3dbb4a5168369a0000fe

fun evenOrOdd(number: Int): String = if (number % 2 == 0) "Even" else "Odd"

fun main(){
    val n = readLine()!!.toInt();
    println(evenOrOdd(n))
}