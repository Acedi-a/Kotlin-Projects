// https://www.codewars.com/kata/59f11118a5e129e591000134/train/kotlin

fun repeats(arr: IntArray): Int {
    val mapita = mutableMapOf<Int, Int>()
    for (i in arr) {
        mapita[i] = (mapita[i]?: 0) + 1;
    }

    var res = 0;
    for (i in mapita) {
        if(i.value == 1) res+=i.key;
    }

    return res;
}

fun main(){
    val n = intArrayOf(4, 5, 7, 5, 4, 8);
    println(repeats(n))
}