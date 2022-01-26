fun main(args: Array<String>) {

    //Ejercicio 5.11
    var cliente1 = Cliente("Laura", "Rodríguez", "49072185Y")
    var cuenta1=Cuenta(cliente1)
    cliente1.addCuenta(cuenta1.numCuenta)
    println(cliente1.toString())
    println(cuenta1.toString())

    //Ejercicio5.12
    var autor1=Autor("Pepe","Perez","1-1-1980")
    var autor2=Autor("Pepa","Martinez","12-12-1990")
    var libro1=Libro("Título",mutableListOf(autor1,autor2),"1-1-2022" )
    println(libro1.toString())

    //Ejercicio5.13


}