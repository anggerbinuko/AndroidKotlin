package id.ac.pnm.ti2b.androidkotlin

fun main(){
    val input = "ini SELASA"
    val encLamb:(String)->String = {input->input.toLowerCase()}

    println(encodeMsg(input, ::encNormalFun))
    println(encodeMsg(input, encLamb))
    println(encodeMsg(input){
        input->"Hari apa ini? ${input.toUpperCase()}"
    })
}

// fungsi high order
fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
}

fun encNormalFun(input:String):String{
    return input.toUpperCase()
}
