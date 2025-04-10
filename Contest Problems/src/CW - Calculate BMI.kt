// https://www.codewars.com/kata/57a429e253ba3381850000fb/train/kotlin

fun bmi(weight: Double, height: Double): String {
    var res = weight / (height*height);
    if (res <= 18.5) return "Underweight"
    else if (res <= 25.0) return "Normal"
    else if (res <= 30.0) return "Overweight"
    else return "Obese"
}

fun main(){
    val n1 = 50.0;
    val n2 = 1.65
    println(bmi(n1, n2));
}
