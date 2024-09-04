
fun main() {
    print("Cantidad de nodos: ")
    val nodos = readLine()!!.toInt()
    print("Cantidad de aristas: ")
    val aristas = readLine()!!.toInt()

    // Se declara una lista de boleanos donde se iran marcando como true en el 'DFS' si es que son visitados
    var visitados = MutableList(nodos+1) {false}

    //Se declara la lista, la primera parte con un tamaño definido donde las posiciones serian los nodos como tal, y la segunda parte vacia para añadirlo despues
    var listaAdyacente = MutableList(nodos+1) { mutableListOf<Int>() }

    repeat(aristas){
        print("Nodo: ")
        val x = readLine()!!.toInt()
        print("Conectado a:  ")
        val y = readLine()!!.toInt()

        // Se añaden las conexiones como un grafo no dirigido
        listaAdyacente[x].add(y)
        listaAdyacente[y].add(x)
    }

    // Se mandan los datos al dfs y el nodo inicial como 1
    DFS(1, visitados, listaAdyacente)

    // Se guarda en este arreglo los inidices que son falsos, se filtran los negativos
    var noConectados = visitados.withIndex().filter { !it.value }.map { it.index}

    // Aqui se pregunta si es de tamaño 1 dado que el 0 siempre va estar, se podria eliminar ese 0 y ya poro esto es lo mismo
    // creo xd
    if (noConectados.size == 1 ) println("El grafo esta conectado!")
    else{
        // Se muestran los nodos que no estan conectados
        println("Nodos que faltan conectar")
        for (i in 1..noConectados.size-1){
            print("${noConectados[i]} ")
        }
    }


}

fun DFS(nodo : Int, visitados : MutableList<Boolean>, lista : MutableList<MutableList<Int>> ) {
    // Se visita el nodo y marca como 'true'
    visitados[nodo] = true
    for (vecino in lista[nodo]) {
        // Para cada vecino o nodo conectado al nodo que estamos actualmente, si no esta visitado entonces se lo manda al 'DFS' otra vez, pero el nodo inicial como el vecino que se encontro sin visitar
        if (!visitados[vecino]) DFS(vecino, visitados, lista)
    }
}