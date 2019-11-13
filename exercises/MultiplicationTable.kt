package exercises

fun main(args:Array<String>){
    println("Enter a number")
    var x = readLine()!!.toInt()
    println("Enter a number")
    var y = readLine()!!.toInt()
    var arrayResults = Array<Int>(y+1){0}
    for (i in 1..y){
    arrayResults[i] = x*i
    println(arrayResults[i])
    }}



