package exercises

fun main(args: Array<String>){
    println("Enter a year")
    var year = readLine()!!.toInt()
    if(year%4 == 0) println("Year is a leap year")
    else println("Year is not a leap year")

}