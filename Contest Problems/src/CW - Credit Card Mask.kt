// https://www.codewars.com/kata/5412509bd436bd33920011bc/train/kotlin

fun maskify(cc: String): String {
    if (cc.length <=4) return cc;
    val res = "#".repeat(cc.length - 4)+cc.substring(cc.length - 4, cc.length)
    return res
}

//Solucion optima
fun maskifyOptimo(cc: String) = cc.takeLast(4).padStart(cc.length,'#')


fun main(){
    val test = arrayOf("4556364607935616","64607935616","1","","Skippy","Nananananananananananananananana Batman!");
    for(t in test){
        //println(t)
        val res = maskify(t);
        println("$t = $res")
    }
}