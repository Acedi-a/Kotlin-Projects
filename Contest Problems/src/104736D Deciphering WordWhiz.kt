// https://codeforces.com/gym/104736/problem/D

fun main() {
    var pals = mutableListOf<String>()
    repeat(readLine()!!.toInt()) {
        pals.add(readLine()!!)
    }
    val clave = pals[0]
    var mapi = mutableMapOf<String, String>()

    repeat(readLine()!!.toInt()) {
        var cont = 0
        var code = readLine()!!

        for (p in pals) {
            var cad = ""
            for (i in 0..p.length-1) {
                if (p[i] == clave[i]) cad+="*"
                else if (p[i] in clave) cad+="!"
                else cad += "X"
            }
            if (cad == code) cont++
        }
        println(cont)
    }

}