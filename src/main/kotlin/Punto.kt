class Punto (private var x:Int, private var y:Int){

    fun get_x() :Int{ return x }
    fun get_y() :Int{ return y }

    override fun toString(): String {
        return "Punto(x=$x, y=$y)"
    }


}