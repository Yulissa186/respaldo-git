fun main(parametro: Array<String>){
    print("Ingrese un valor entero:")
    val valor = readln().toInt()
    when {
        valor == 0 -> println("Se ingresó el cero")
        valor > 0 -> println("Se ingresó un valor positivo")
        else -> println("Se ingresó un valor negativo")
    }
}