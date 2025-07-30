fun main(parametro: Array<String>) {
    print("Ingrese coordenada x:")
    val x = readln().toInt()
    print("Ingrese coordenada y:")
    val y = readln().toInt()
    if (x > 0 && y > 0)
        print("Se encuentra en el primer cuadrante")
    else
        if (x < 0 && y > 0)
            print("Se encuentra en el segundo cuadrante")
        else
            if (x < 0 && y < 0)
                print("Se encuentra en el tercer cuadrante")
            else
                if (x > 0 && y < 0)
                    print("Se encuentra en el cuarto cuadrante")
                else
                    print("Se encuentra en un eje")
}