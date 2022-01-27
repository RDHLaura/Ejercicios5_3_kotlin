class Circulo (private var punto:Punto, private var radio:Double){
    fun get_radio() :Double{ return radio }
    fun get_punto() :Punto{ return punto }

    fun perimetro():Double{
        var p=2*Math.PI*radio
        p=Math.round(p * 100.0)/100.0
        return p
    }

    fun area():Double{
        var a=Math.PI* Math.pow(radio,2.0)
        a= Math.round(a*100.0)/100.0
        return a
    }

    override fun toString(): String {
        return "Circulo(punto=$punto, radio=$radio)"
    }


}