// https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/kotlin

fun makeComplement(dna : String) : String {
    var res = "";
    for(let in dna){
        if(let == 'A') res+="T";
        else if(let == 'T') res+="A";
        else if(let == 'C') res+="G";
        else res+="C";
    }
    return res;

}


fun main() {
    val n = "ATTGC";
    println(makeComplement(n))
}