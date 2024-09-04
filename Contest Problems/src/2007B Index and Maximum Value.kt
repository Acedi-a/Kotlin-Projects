// Wrong answer test 2
// pipipi

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val (a,b) = readLine()!!.split(" ").map { it.toInt() }
        var arr = readLine()!!.split(" ").map { it.toInt() }.associateWith {0}.toMutableMap()
        //println("\n"+arr+"\n\n")
        var res = mutableListOf<Int>()



        for(i in  1..b){

            val input = readLine()!!.split(" ")
            //println("Entrada: "+input)
            val op = input[0].first()
            val ini = input[1].toInt()
            var fin = input[2].toInt()

            var rango = arr.filterKeys { it -> it >= ini && it <= fin }
            for (index in rango.keys){
                val t = if ( op == '+') 1 else -1

                if (arr.contains(index+t)){
                    arr.remove(index)
                    arr[index+t]!! +1
                }
                else{
                    arr.remove(index)
                    arr[index+t] = 0
                }
                //println("new "+(index+t))
            }
            res.add(arr.maxOf { it.key })
            //println(arr)
        }
        println(res.joinToString(" "))
    }
}

