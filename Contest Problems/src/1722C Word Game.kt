// https://codeforces.com/contest/1722/problem/C

fun main() {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        var pals : MutableMap<String, Int> = mutableMapOf()

        val p1 = readLine()!!.split(' ')
        val p2 = readLine()!!.split(' ')
        val p3 = readLine()!!.split(' ')

        val palabras = p1 + p2 + p3
        for (pl in palabras) {
            pals[pl] = pals.getOrDefault(pl, 0) + 1
        }

        //println(pals)

        var s1 = 0
        for (p in p1) {
            val punts = pals[p]
            s1 += if(punts == 1) 3 else if (punts == 2) 1 else 0
        }

        var s2 = 0
        for (p in p2) {
            val punts = pals[p]
            s2 += if(punts == 1) 3 else if (punts == 2) 1 else 0
        }

        var s3 = 0
        for (p in p3) {
            val punts = pals[p]
            s3 += if(punts == 1) 3 else if (punts == 2) 1 else 0
        }
        println("$s1 $s2 $s3")
    }
}