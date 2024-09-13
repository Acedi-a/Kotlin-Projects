// https://codeforces.com/problemset/problem/1996/B

fun main() {
    val n = readLine()!!.toInt()

    repeat(n) {
        val (a,b) = readLine()!!.split(" ").map {it.toInt()}
        var matrix = MutableList(a) { MutableList(a) { 0 } }

        for (iy in 0 until a) {
            val cad = readLine()!!.map { it.toString().toInt() }
            for (ix in 0 until a) {
                matrix[iy][ix] = cad[ix]
            }
        }

        //matrix.forEach { println(it.joinToString(" ")) }

        val aux = a/b
        val celdas = aux*aux
       // println(celdas)

        var iy = 0
        var ix = 0
        for (i in 0 until celdas){
            print(matrix[iy][ix])
            if (ix + b < a){
                ix += b
            }else{
                iy += b
                ix = 0
                println()
            }
        }
    }
}