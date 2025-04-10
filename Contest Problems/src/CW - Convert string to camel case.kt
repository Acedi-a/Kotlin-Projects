
// https://www.codewars.com/kata/517abf86da9663f1d2000003/train/kotlin
// no me da el test random, carajomerda

fun toCamelCase(str:String):String {
    if (str == "") return "";
    val aux = str.split("_","-").toMutableList();
    if (aux.size == 1) return aux[0];
    for (i in 0..<aux.size) {
        //println(aux[i]);
        if (i == 0){
            val pal = aux[i];
            val raxu = pal[0]+pal.substring(1,pal.length).lowercase();
            aux[i] = raxu;
        }
        else {
            val pal = aux[i];
            val raxu = pal[0].uppercase()+pal.substring(1,pal.length).lowercase();
            aux[i] = raxu;
        }
    }
    return aux.joinToString("");
}


fun main(){
    val n = "PLySEHFmqDqGLBuDxWrNXVYn";
    println(toCamelCase(n));

}