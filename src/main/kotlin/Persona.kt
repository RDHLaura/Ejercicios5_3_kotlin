class Persona {

    var dni: String=""
        get() = field

    var cuentas:MutableList<Cuenta> = mutableListOf<Cuenta>()

    constructor(dni: String)
    {
        val tabla: Map<Int, Char> = mapOf(0 to 'T',1 to 'R',2 to 'W',3 to 'A',4 to 'G',
            5 to 'M',6 to 'Y',7 to 'F', 8 to 'P' , 9 to 'D', 10 to 'X', 11 to 'B', 12 to 'N',
            13 to 'J', 14 to 'Z', 15 to 'S', 16 to 'Q', 17 to 'V', 18 to 'H', 19 to 'L',
            20 to 'C', 21 to 'K', 22 to 'E')

        val resto: Int = dni.slice(0..dni.length-2).toInt() % 23
        if (dni[dni.length-1] != tabla[resto])
            println("DNI erróneo")
        else
            this.dni=dni
    }
}