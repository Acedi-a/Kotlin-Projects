// https://www.codewars.com/kata/51c8e37cee245da6b40000bd/train/kotlin

fun solution(input: String, markers: CharArray): String {
    var res = "";
    val cads = input.lines();
    val tam = cads.size;
    for ((indice, cad) in cads.withIndex()){
        //println("linea: $cad")
        var auxcad = "";
        for (letra in cad){
            if (letra !in markers){
                auxcad+=letra;
                //println(letra)

            }
            else{
                res+=auxcad.trimEnd();
                if (indice != tam-1) res+="\n";
                break;
            }

            if (auxcad.length == cad.length) {
                res+=auxcad.trimEnd();
                if (indice != tam-1) res+="\n"
            }

            //println("auxcad: ${auxcad.length}\ncad: ${cad.length}");
        }
    }
    return res.trimEnd();
}


fun solucionOptima(input: String, markers: CharArray): String =
    input.lines().map { line ->
        line.split(*markers).first().trimEnd()
    }.joinToString("\n")

fun main (){
    val result = solution("apples, plums % and bananas\npears\noranges !applesauce", charArrayOf('%', '!'))
    print(result);
}