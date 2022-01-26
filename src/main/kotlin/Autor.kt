class Autor {
    var nombre=""
        private set
    var apellido:String=""
        private set
    var fecha_nacimiento:String=""
        private set
    var bibliografia:MutableList<String> = mutableListOf()


    constructor (nombre:String,apellido:String,fecha_nacimiento:String){
        this.nombre=nombre
        this.apellido=apellido
        this.fecha_nacimiento=fecha_nacimiento
    }

    fun addLibro(titulo:String){
        bibliografia.add(titulo)
    }

    override fun toString(): String {
        return "Autor: nombre='$nombre', apellido='$apellido', fecha_nacimiento='$fecha_nacimiento', bibliografia=$bibliografia"
    }


}