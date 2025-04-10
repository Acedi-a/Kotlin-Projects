// https://www.codewars.com/kata/55c6126177c9441a570000cc/kotlin

fun orderWeight(string:String):String {
    val gax = string.split(' ');
    val lista : MutableList<Pair<String, Int>> = mutableListOf();
    for (g in gax) {
        val aux = g.sumOf { it.digitToInt() }
        lista.add(g to aux);
    }

    val raux = lista.sortedWith(compareBy({ it.second }, { it.first })).joinToString(" "){it.first};
    return raux;
}


fun main(){
    val ga = orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123")
    println(orderWeight(ga))
}