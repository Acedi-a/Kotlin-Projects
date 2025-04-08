// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/kotlin

fun removeChar(str: String): String = str.substring(1, str.length - 1);

fun main(){
    val str = readLine()!!;
    println(removeChar(str))
}