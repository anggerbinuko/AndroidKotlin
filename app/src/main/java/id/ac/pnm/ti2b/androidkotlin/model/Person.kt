package id.ac.pnm.ti2b.androidkotlin.model

class Person(var firstName:String, var lastName:String){
    var fullName:String = ""
        get() = "$firstName $lastName"
        set(value) {
            val component = value.split(" ")
            firstName = component[0]
            lastName = component[1]
            field = value
        }
}

