fun main() {
    repeat(readLine()!!.toInt()) {
        var matrix = Array(8) {Array(8) {' '} }

        var col = 0
        for (fila in 0 until 8) {
            val cad = readLine()!!
            for (col in 0 until 8) {
                matrix[fila][col] = cad[col]
            }
        }

        for (fila in matrix) {
            println(fila.joinToString(" "))
        }

        var letra = ' '
        for (col in 0 until 8) {
            if ( matrix[0][col] != '.' ) {
                val ini = matrix[0][col]
                var key = true
                for (fil in 0 until 8){
                    if ( ini != matrix[fil][col] ){
                        key = false
                        break
                    }
                }

                if (key){
                    letra = ini
                    break
                }
            }
        }
    }

}