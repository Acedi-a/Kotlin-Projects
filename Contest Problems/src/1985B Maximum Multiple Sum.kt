// https://codeforces.com/contest/1985/problem/B

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val num = readLine()!!.toInt()
        println(Ternario(num))
    }
}

// Por fuerza Bruta, calcular las sumas y elegir al maximo multiplo
fun FuerzaBruta (num : Int) : Int {
    var maxi = 0
    var mult = 0
    for (i in 2..num){
        var sum = 0
        for (j in i..num step i){
            sum += j
        }

        if (maxi < sum){
            maxi = sum
            mult = i
        }
    }
    return mult
}

// Si el numero dado es 3 entonces la suma mas alta es con multiplo 3, sino siempre sera 2
fun Ternario (num : Int) : Int = if (num == 3) 3 else 2