class Cliente  {
    var _nombre:String ="nombre"
        private set
    var _apellidos ="apellidos"
        private set
    var _dni = "dni"
        private set

    constructor(_nombre:String, _apellidos:String, _dni:String){
        if(comprobar_dni(_dni)==false){

        }
        this._nombre=_nombre
        this._apellidos=_apellidos
        comprobar_dni(_dni)


    }
    constructor(_dni:String){
        comprobar_dni(_dni)
    }

    fun comprobar_dni(_dni:String):Boolean{
        val tabla: Map<Int, Char> = mapOf(0 to 'T',1 to 'R',2 to 'W',3 to 'A',4 to 'G',
            5 to 'M',6 to 'Y',7 to 'F', 8 to 'P' , 9 to 'D', 10 to 'X', 11 to 'B', 12 to 'N',
            13 to 'J', 14 to 'Z', 15 to 'S', 16 to 'Q', 17 to 'V', 18 to 'H', 19 to 'L',
            20 to 'C', 21 to 'K', 22 to 'E')

        val resto: Int = _dni.slice(0.._dni.length-2).toInt() % 23
        if (_dni[_dni.length-1] != tabla[resto])
        {
            println("DNI erróneo")
            return false
        }
        else
        {
            this._dni=_dni
            return true
        }
    }



    override fun toString(): String {
        return "Cliente: $_nombre, $_apellidos, con DNI '$_dni.)"
    }


}