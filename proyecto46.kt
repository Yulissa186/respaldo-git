fun main(parametro: Array<String>) {
    var suma = 0.0
    do {
        print("Ingrese número de cuenta:")
        val cuenta = readln().toInt()
        if ( cuenta >= 0) {
            print("Ingrese saldo:")
            val saldo = readln().toDouble()
            if (saldo > 0) {
                println("Saldo Acreedor.")
                suma += saldo
            } else
                if (saldo < 0)
                    println("Saldo Deudor.")
                else
                    println("Saldo Nulo.")
        }
    } while(cuenta>=0)
    println("Total de saldos Acreedores: $suma")
}