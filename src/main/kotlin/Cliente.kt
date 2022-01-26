class Cliente  {
    var _nombre:String ="nombre"
        private set
    var _apellidos ="apellidos"
        private set
    var _dni = "dni"
        private set
    private var cuentas:MutableList<Int> = mutableListOf()

    constructor(_nombre:String, _apellidos:String, _dni:String){

        this._nombre=_nombre
        this._apellidos=_apellidos
        this._dni=_dni

    }
    constructor(_dni:String){
        this._dni=_dni
    }


    fun addCuenta(num_cuenta:Int){
        cuentas.add(num_cuenta)
    }

    override fun toString(): String {
        return "Cliente(nombre='$_nombre', apellidos='$_apellidos', dni='$_dni', cuentas=$cuentas)"
    }


}