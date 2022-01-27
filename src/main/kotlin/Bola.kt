import java.lang.Math
class Bola( circulo: Circulo) {
    var circulito:Circulo=circulo
    fun getCirculo():Circulo{return circulito}
    fun colision(bolita:Bola):Boolean{
        var x_bola1=circulito.get_punto().get_x().toDouble()
        var y_bola1=circulito.get_punto().get_y().toDouble()
        var r_bola1=circulito.get_radio()
        var x_bola2=bolita.getCirculo().get_punto().get_x()
        var y_bola2=bolita.getCirculo().get_punto().get_y().toDouble()


        var r_bola2=bolita.circulito.get_radio()

        var distan= Math.sqrt(Math.pow(( x_bola1-x_bola2 ),2.0) + (Math.pow((y_bola1-y_bola2),2.0)))
        if (distan<=(r_bola1+r_bola2)){
            return true
        }
        return false

    }
}