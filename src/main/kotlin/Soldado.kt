class Soldado {
    var nombre=""
        private set
    var tipo=""
        private set
    var potenciaFuego=15.2f
        private set

    constructor(_nombre:String, _tipo:String, _potenciaFuego:Float){
        nombre=_nombre
        tipo=_tipo
        potenciaFuego=_potenciaFuego
    }

    override fun toString(): String {
        return "Soldado $nombre', del tipo='$tipo', potenciaFuego=$potenciaFuego)"
    }

}