class Libro {

    var titulo=""
        private set
    var autores:MutableList<Autor> = mutableListOf()
        private set
    var fecha_publicacion:String=""
    constructor(titulo:String, autores: MutableList<Autor>,fecha_publicacion:String){
        this.titulo=titulo
        this.autores=autores
        this.fecha_publicacion=fecha_publicacion
        addInAutores()
    }

    fun addInAutores(){
        for (autor in autores){
            autor.addLibro(titulo)
        }
    }

    override fun toString(): String {
        return "Libro(titulo='$titulo', autores=$autores, fecha_publicacion='$fecha_publicacion')"
    }


}