package id.ac.pnm.ti2b.androidkotlin

import id.ac.pnm.ti2b.androidkotlin.model.Aquarium
import id.ac.pnm.ti2b.androidkotlin.model.Circle
import id.ac.pnm.ti2b.androidkotlin.model.House
import id.ac.pnm.ti2b.androidkotlin.model.Person

fun main(){
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

// fungsi panggil class House
fun panggilHouse(){
    val A1 = House()
    val A2 = House()
    val A3 = House()

    println(A1.houseColor)
    A1.houseColor = "hijau"
    println(A1.houseColor)
    A1.updateColor("orange")
//
//    A2.houseColor = "merah"
//    println(A2.houseColor)
//    A3.houseColor = "biru"
//    println(A3.houseColor)
}

fun panggilPerson(){
    val person = Person("Alex","Sander")
    println(person.firstName)
    println(person.lastName)
    println(person.fullName)
    person.firstName = "Bobby"
    println(person.fullName)
    person.fullName = "Gracia Polly"
    println(person.firstName)
    println(person.lastName)
}

fun panggilCircle(){
    val lingkaran1 = Circle(10.0)
    val lingkaran2 = Circle(20)
    val lingkaran3 = Circle("Linkaran 3")
}