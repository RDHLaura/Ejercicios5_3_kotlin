class Cuenta{
    var numCuenta:Int=0
    private set
    var titular:Cliente?=null
    private set
    private var saldo:Double=0.0

    constructor(_titular:Cliente){
        this.titular=_titular
        numCuenta+=1

    }
    //funciones para ingresar y sacar dinero, impedir sacar dinero si el saldo fuese negativo
    fun ingresar(cantidad:Double){
        if(cantidad>0){
            saldo+=cantidad
        }else println("La cantidad debe ser un número positivo.")
    }
    fun pago(cantidad: Double){
        if(cantidad>0){
            saldo-=cantidad
        }else println("La cantidad debe ser un número positivo.")
    }

    override fun toString(): String {
        return "Cuenta(numCuenta=$numCuenta, titular=$titular, saldo=$saldo)"
    }


}
