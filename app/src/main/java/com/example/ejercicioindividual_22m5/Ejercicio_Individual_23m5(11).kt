package com.example.ejercicioindividual_22m5

//Ejercicio A
   fun main(){
    //se declaran las 3 variables var cambia y val no
    var numero1=10
    val numero2=33
    val numero3=66
    //variable suma
    var suma=numero1+numero2+numero3
    println(suma)
    //se asigna de nuevo la variable numero1
    numero1=55
    suma=numero1+numero2+numero3
    println(suma)
    //se hace una lista con los numeros y se llama a .average para el promedio
    var promedio= listOf(numero1,numero2,numero3).average()
    //Imprime el promedio usando el ultimo numero1 (55)
    println("El promedio es $promedio")
}


/*
//Ejercicio B lo que entendi es hacer una funcion con lo anterior

fun main(){
    operaciones()
}
fun operaciones(){
    var numero1=10
    val numero2=33
    val numero3=66
    var suma=numero1+numero2+numero3
    println(suma)
    numero1=55
    suma=numero1+numero2+numero3
    println("La suma de los numeros es $suma")
    var promedio= listOf(numero1,numero2,numero3).average()
    println("El promedio es $promedio")
}
*/

/*
//Ejercicio C

   fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
//en este constructor se indica que el referrer puede ser nulo y al ser una persona puedo acceder
//a cualquier parte de su constructor, para este ejercicio se llama al nombre de Person
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
    println("Nombre: $name")
        println("Edad: $age")
        println("Le gusta: $hobby")
        if (referrer==null){
            println("No le han referido")
        }else{
            //llamo al nombre del referrer
            println("Fue referido por ${referrer.name}")
        }
    }
}
*/


/*
//Ejercicio D:

   fun main() {
    val winningBid = Bid(5000, "Private Collector")
    println("Item A is sold at ${auctionPrice(winningBid, 2000)} to ${winningBid.bidder}")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

//la funcion debe retornar un int
fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {

    //si bid no es nulo(primer caso y el monto es mayor al minimo
    if (bid != null && bid.amount >= minimumPrice) {
        //retorna el precio de la oferta
        return bid.amount
    } else {
        //sino el precio minimo
        return minimumPrice
    }
}
*/