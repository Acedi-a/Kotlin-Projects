// Error en casos

fun main() {
    var giga = mutableListOf<Pair<Int,Int>>()
    val n = readLine()!!.toInt()

    repeat(n){
        val (a,b) = readLine()!!.split(" ").map {it.toInt()}
        giga.add(a to b)
    }

    //println(giga)
    giga = giga.sortedWith(compareBy({it.first}, {it.second})).toMutableList()
    //println(giga)


    var  sum : Long = 0
    for (i in 0..n-1){
        //println(giga[i].first.toString() + " " + giga[i].second)
        if (i == 0) sum += giga[i].second
        else sum += giga[i].first
    }
    println(sum)
}