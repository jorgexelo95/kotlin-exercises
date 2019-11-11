package exercises

fun main(args: Array<String>){
    println("Enter a number")
    var num = readLine()!!.toInt()
    when(num%2){
        0 -> println("Number is even")
        1 -> println("Number is odd")
    }
}