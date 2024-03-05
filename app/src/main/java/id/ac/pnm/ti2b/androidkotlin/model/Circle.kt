package id.ac.pnm.ti2b.androidkotlin.model

class Circle(val r:Double) {
    constructor(d:Int) : this(d/2.0)
    constructor(name:String) : this(10.0){
        println("dipanggil dari string contructor")
    }

    init {
        println(Math.PI *r*r)
    }
}