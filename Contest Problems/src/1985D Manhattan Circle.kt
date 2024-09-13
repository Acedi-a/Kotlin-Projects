// https://codeforces.com/contest/1985/problem/D

fun main() {
    val n = readLine()!!.toInt()
    repeat(n){

        val (a,b) = readLine()!!.split(" ").map {it.toInt()}
        var ini = -1
        var mid = -1
        var fin = b
        var key = false
        var key2 = true
        for (i in 1..a){
            val cad = readLine()!!
            if ('#' in cad && ini == -1){
                //println("\n"+cad)
                ini = cad.indexOfFirst { it == '#' }
                mid = i

            }
            else if('#' in cad && key2==true){
                key = true
                val aux = cad.indexOfFirst { it == '#' }
                if (aux < fin){
                    mid = i
                    fin = aux
                }
                else key2 = false
            }
        }
        ini++
        if (!key){

            println(mid.toString()+" "+ini.toString())
        }
        else{

            println(mid.toString()+" "+ini.toString())
        }

    }
}