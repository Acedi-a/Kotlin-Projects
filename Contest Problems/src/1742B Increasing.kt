// https://codeforces.com/contest/1742/problem/B

fun main() {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        var nums = readLine()!!.split(" ").map { it.toInt() }
        if (n>1){
            var mapi : MutableMap<Int, Int> = mutableMapOf()
            for (num in nums){
                mapi[num] = mapi.getOrDefault(num,0) + 1
            }

            if (mapi.values.any({it > 1})) println("NO")
            else println("YES")
        }
        else println("YES")

    }
}