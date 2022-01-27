class Escuadron {
    var misSoldados:MutableList<Soldado> = mutableListOf()
    var nombre=""
    private set
    var potenciaFuego=0.0f

    constructor(nombre:String,soldado: Soldado){
        this.nombre=nombre
        this.potenciaFuego+=soldado.potenciaFuego
        addSoldado(soldado)
    }

    fun addSoldado(soldado:Soldado){
        misSoldados.add(soldado)
        this.potenciaFuego+=soldado.potenciaFuego
    }

    override fun toString(): String {
        var soldados=""
        misSoldados.forEach(){
            soldados+=it.toString()
            soldados+="\n"
        }
        return "Escuadron '$nombre', potenciaFuego=$potenciaFuego, Soldados:$soldados."
    }


}