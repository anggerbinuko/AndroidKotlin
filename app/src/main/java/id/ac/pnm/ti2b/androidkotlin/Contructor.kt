package id.ac.pnm.ti2b.androidkotlin

class ContructorA {} // tanpa parameter

class ContructorB(x:Int) {}  // dengan parameter tanpa keyword variable

class ContructorC(val y:Int, val z:Int, val x:Int = 10) {}  // dengan parameter dengan keyword variable

fun main(){
    val A = ContructorA()
    val B = ContructorB(5)
    val C = ContructorC(5,2)

    println(C.x)
}