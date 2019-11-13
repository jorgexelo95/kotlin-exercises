package exercises

fun main(args: Array<String>){
    println("Enter first number")
    var a = readLine()!!.toInt()
    println("Enter second number")
    var b = readLine()!!.toInt()
    println("Enter third number")
    var c = readLine()!!.toInt()
    if(a > b && a > c) println("Greatest number is $a")
    if(b > a && b > c) println("Greatest number is $b")
    else if (c > a && c > b) println("Greatest number is $c")
}