// https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/kotlin

fun find(integers: Array<Int>): Int {
    val par :MutableList<Int> = mutableListOf()
    val impar :MutableList<Int> = mutableListOf()

    for (i in integers) {
        if (i % 2 == 0) par.add(i)
        else impar.add(i)

        if(par.size == 1 && impar.size >= 2) return par.first()
        if(impar.size == 1 && par.size >= 2) return impar.first();
    }
    return 0;
}

fun findOptimo(integers: Array<Int>): Int {
    val par = integers.filter { it % 2 == 0 }
    val impar = integers.filter { it % 2 == 1 }

    if (par.size < impar.size) return par.first()
    else return impar.size


}

fun main(){
    val n = arrayOf(Integer.MAX_VALUE, 0, 1);
    println(n.toList());
    println(find(n));
}
