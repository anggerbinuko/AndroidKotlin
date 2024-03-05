package id.ac.pnm.ti2b.androidkotlin.model

class House {
    var houseColor:String = "white"
    val numberOfWindows:Int = 2
    val isForSale:Boolean = false

    fun updateColor(newColor: String){
        println("Warna lama = $houseColor")
        houseColor = newColor
        println("Warna baru  = $houseColor")
    }

    fun putOnSale(){}
}