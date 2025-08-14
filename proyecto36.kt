fun main(parametro: Array<String>) {
    print("Cuantas alturas ingresará?:")
    val n = readln().toInt()
    var x = 1
    var suma = 0.0
    while (x <= n) {
        print("Ingrese la altura de la persona(Ej:1.76) :")
        val altura = readln().toDouble()
        suma = suma + altura
        x = x + 1
    }
    val promedio = suma / n
    println("Altura promedio: $promedio")
}