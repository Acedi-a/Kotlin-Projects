// https://www.codewars.com/kata/5672682212c8ecf83e000050/train/kotlin

fun dblLinear(n:Int):Int {
    val res = mutableListOf(1);
    var i = 0; var j = 0;

    while(res.size <= n){
        val y = 2 * res[i] + 1;
        val z = 3 * res[j] + 1;

        val x = minOf(y, z);
        if(x != res.last()) res.add(x);

        if(x==y)i++;
        else j++
    }
    //println(res)
    return res[n];

}


fun main(){
    val n = 10;
    println(dblLinear(n))
}