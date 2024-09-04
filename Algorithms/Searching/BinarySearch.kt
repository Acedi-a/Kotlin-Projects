
fun main() {
    val arr = arrayOf(1,2,6,10,15,23,40,100,1500) // La lista debe estar ordenada
    val find = 10

    /*
    - Retorna un boleano
    La funcion BinarySeacrhReturnBool retorna un boleano como verdadero si se encontro el numero
    y retorna como falso si el numero no se encontro
    */
    val existe = BinarySeacrhReturnBool(arr,find)
    if (existe) println("El valor $find existe en el arreglo")
    else println("El valor $find no existe arreglo")


    /*
    - Retorna un entero como indice
    En este caso la función BinarySeacrhReturnIndex retorna -1 como inidice si no se hallo el numero en el arreglo
    en caso de hallar el numero entonces retorna mid, que seria el indice donde se encontro el numero
    */
    val index = BinarySeacrhReturnIndex(arr,find)
    if (index == -1) println("El valor $find no existe arreglo")
    else println("El valor $find existe en el arreglo en la posicion $index")


    /*
    - Retorna un Par con un boleano y su indice
    En este otro caso la funcion 'BinarySeacrhReturnMixed' devulve un par con un boleano y un entero
    donde el boleano indica que se encontro y el entero es el indice, si el numero no se encuentra entonces
    retorna (false,-1) y luego para usar esos valores en nuestra variable 'par' seria 'par.first' y 'par.second'
    */
    val par = BinarySeacrhReturnMixed(arr,find)
    if (par.first) println("El valor $find existe en el arreglo en la posicion ${par.second}")
    else println("El valor $find no existe en el arreglo")
}


fun BinarySeacrhReturnBool(arr: Array<Int>, find : Int): Boolean {
    var L = 0
    var R = arr.size - 1

    while (L <= R) {
        var mid = (L + R) / 2
        if (arr[mid] < find) {
            L = mid + 1
        }
        else if ( arr[mid] > find) {
            R = mid - 1
        }
        else {
            return true // En este ejemplo si se encuentra ese numero pues retorna un true = Verdadero
        }
    }
    return false // Si termino el while y no se hallo el numero entonces retorna false = falso
}



fun BinarySeacrhReturnIndex(arr: Array<Int>, find : Int): Int {
    var L = 0
    var R = arr.size - 1

    while (L <= R) {
        var mid = (L + R) / 2
        if (arr[mid] < find) {
            L = mid + 1
        }
        else if ( arr[mid] > find) {
            R = mid - 1
        }
        else {
            return mid // Si se encuentra el numero entonces retorna mid que seria su indice
        }
    }
    return -1 // Si no se encontro del numero entonces sale del while y como indice retorna -1
}



fun BinarySeacrhReturnMixed(arr: Array<Int>, find : Int): Pair<Boolean, Int> {
    var L = 0
    var R = arr.size - 1

    while (L <= R) {
        var mid = (L + R) / 2
        if (arr[mid] < find) {
            L = mid + 1
        }
        else if ( arr[mid] > find) {
            R = mid - 1
        }
        else {
            return Pair(true, mid)
            // Se retorna un par que contiene el 'true' porque se encontro el numero y su posicion
        }
    }
    return Pair(false, -1) // Se retorna 'false' porque no se encontro el numero y consecuentemente -1 como indice
}
