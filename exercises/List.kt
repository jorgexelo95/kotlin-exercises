package exercises

fun main (args: Array<String>){

    var list = listOf<Char>('A','B','C','D','V')
    var mutlist = mutableListOf<Int>(6,7,8,9,0)

    var bool = list.contains('V')
    var bool2 = mutlist.contains(2)

    println(bool)
    println(bool2)

    val arrayl = arrayListOf<Int>(1,2,3,4,5,6)
    for(i in 0..2){
        println(arrayl[i])
    }

    if(arrayl.isEmpty()){
        println("array list is empty")
    }
    else println("array list is not empty")
    mutlist.clear()
    if(mutlist.isEmpty()){
        println("array list is empty")
    }
    else println("array list is not empty")

}