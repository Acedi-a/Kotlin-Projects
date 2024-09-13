fun main() {
    val arr = mutableListOf<Int>(1,3,4,2,5,10,20,-5);
    println("Original: "+arr)
    BubbleSort(arr)
    println("Ordenado: "+arr)
}


fun BubbleSort(ls: MutableList<Int>) {
    val l = ls.size
    for (i in  0 until l-1) {
        // print(" $i : $ls\n") // Como cambia el arreglo en cada iteracion, donde cada vez se va moviendo el numero mas grande al final del arreglo
        for (j in 0 until l - i - 1){
            if (ls[j] > ls[j+1]) {
                val temp = ls[j]
                ls[j] = ls[j+1]
                ls[j+1] = temp
            }
        }
    }
}

