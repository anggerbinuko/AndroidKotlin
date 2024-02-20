package id.ac.pnm.ti2b.androidkotlin

fun main(args: Array<String>) {
    biodata("Angger", 32)
    hobby("mancing", "mancing keributan")
}

fun biodata(name:String, age:Int){ // minimal 2 parameter/args
    println("=====================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("=====================")
}

fun hobby(nama:String, desc:String){
    println("Saya punya hobby $nama")
    println("Hobby tersebut adalah $desc")
}

