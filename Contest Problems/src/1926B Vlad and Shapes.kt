// https://codeforces.com/contest/1926/problem/B

fun main() {
    repeat(readLine()!!.toInt()) {
        var res = ""
        var key = true
        val rp = readLine()!!.toInt()
        var maxi = 0
        for (i in 1..rp) {
            val cad = readLine()!!
            if ('1' in cad && key) {
                val cant = cad.count{it == '1'}
                if (cant == 1){
                    res = "TRIANGLE"
                    key = false
                }
                else if (cant > 1){
                    if (maxi == 0) {
                        maxi = cant
                    }
                    else if ( cant < maxi){
                        res = "TRIANGLE"
                        key = false
                    }
                    else {
                        res = "SQUARE"
                        key = false
                    }
                }
            }
        }
        println(res)
    }
}