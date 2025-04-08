// https://www.codewars.com/kata/5875b200d520904a04000003/train/kotlin

import kotlin.math.abs

fun enough(cap: Int, on: Int, wait: Int) : Int = if (cap - (on + wait) > 0) 0 else abs(cap - (on + wait))

fun main (){
    println(enough(100,60,50))
}