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
    var punto=Punto(10,1)
    var circulo=Circulo(punto, 1.0)
    println(circulo.perimetro())

    //Ejercicio5.14
    var bola1=Bola(circulo)
    var punto2=Punto(0,20)
    var circulo2=Circulo(punto2, 1.0)
    var bola2=Bola(circulo2)
    println(bola2.colision(bola1))

    //Ejercicio 5.15
    var soldado1=Soldado("sol1","artilleria", 20.3f)
    var soldado2=Soldado("sol2","artilleria", 20.3f)
    var soldado3=Soldado("sol3","artilleria", 20.3f)
    var escuadro1=Escuadron("Águila", soldado1)

    //escuadro1.addSoldado(soldado1)
    escuadro1.addSoldado(soldado2)
    escuadro1.addSoldado(soldado3)
    println(escuadro1.toString())

}