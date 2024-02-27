package id.ac.pnm.ti2b.androidkotlin

fun main(){
    val sep = "=".repeat(40)
    println(sep)
    val ints = listOf(1, 2, 3, 4)
    println(ints.filter{ i -> i > 1 })
    println(ints.filter{ it > 1 })

    val books = listOf("nature", "biology", "birds")
    println(books.filter{ it.toUpperCase()[2] == 'O' })

    val instruments = listOf("viola", "cello", "violin")
    // eager filter
    println(sep)
    val eager = instruments.filter { it [0] == 'v' }
    println(eager)

    // lazy filter
    println(sep)
    val lazy = instruments.asSequence().filter { it [0] == 'v' }
    println(lazy)
    println(lazy.toList())

    // map
    println(sep)
    println(ints.map{ it * 2 })

    // flatten
    println(sep)
    val list1 = listOf(1,2,3)
    val list2 = listOf('a','b','c')
    val list3 = listOf(true,false)
    val multi = listOf(list1,list2,list3)

    println(list1)
    println(list2)
    println(list3)
    println(multi)
    println(multi.flatten())

}

