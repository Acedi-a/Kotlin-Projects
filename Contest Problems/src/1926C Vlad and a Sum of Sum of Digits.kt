// https://codeforces.com/contest/1926/problem/C

fun main() {
    val reps = 200007
    var nums = MutableList(reps) {0}
    var dp = MutableList(reps) {0}

    for ( i in 1 until reps){
        if (i<10) nums[i-1] = i
        else{
            nums[i-1] = SumaDigitos(i)
        }
    }
    //println(nums)
    dp[0] = nums[0]

    for (i in 1 until reps) {
        dp[i] = nums[i] + dp[i-1]
    }
    //println(dp)

    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        println(dp[n-1])
    }
}

fun SumaDigitos(m : Int) : Int {
    var sum = 0
    var mm = m
    while (mm>=1) {
        sum += mm % 10
        mm /= 10
    }
    //println("num $m : $sum")
    return sum

}