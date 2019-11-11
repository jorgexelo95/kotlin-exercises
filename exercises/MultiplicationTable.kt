package exercises

fun main(args:Array<String>){
    println("Enter a number")
    var x = readLine()!!.toInt()
    println("Enter a number")
    var y = readLine()!!.toInt()
    for(i in 1..y){
        println("$x * $i = ${x*i}")
    }
}