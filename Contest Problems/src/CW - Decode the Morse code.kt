// https://www.codewars.com/kata/54b724efac3d5402db00065e/train/kotlin
// Falta

fun decodeMorse(code: String): String {
    val letras = code.split("(?<=\\S)(?=\\s)|(?<=\\s)(?=\\S)".toRegex()).filter{it.isNotBlank()};
    println(letras)
    var res = "";

    return res;
}

fun main(){
    val res = decodeMorse(".... . -.--   .--- ..- -.. .");
}