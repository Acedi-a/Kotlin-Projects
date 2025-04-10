//https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/kotlin

fun persistence(num: Int) : Int {
    var nu = num
    var cont = 0;
    while (nu >= 10){
        var aux = 1;
        while (nu >= 1){
            aux*= nu % 10;
            nu /= 10;
        }
        nu = aux;
        cont++;
    }
    return cont;
}

fun main(){
    val n = 25;
    println(persistence(n))
}