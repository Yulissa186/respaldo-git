fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val v1 = readln().toInt()
    print("Ingrese segundo valor:")
    val v2 = readln().toInt()
    print("Ingrese tercer valor:")
    val v3 = readln().toInt()
    print("Ingrese cuarto valor:")
    val v4 = readln().toInt()
    val suma = v1 + v2
    println("La suma de $v1 y $v2 es $suma")
    val producto = v3 * v4
    println("El producto de $v3 y $v4 es $producto")
}