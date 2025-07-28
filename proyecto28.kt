fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    if (valor1 < 10 || valor2 < 10 || valor3 < 10)
        print("Alguno de los números es menor a diez")
}