// https://codeforces.com/contest/1722/problem/B

fun main() {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        val c1 = readLine()!!
        val c2 = readLine()!!
        var key = true
        for (i in 0 until n){
            if ((c1[i] == 'R' && c2[i] != 'R' ) || (c2[i] == 'R' && c1[i] != 'R')) {
                key = false
                break
            }
        }
        if (!key) println("NO")
        else println("YES")
    }
}