package exercises

fun main(args:Array<String>){
    println("Enter a number")
    var num = readLine()!!.toInt()
    when(num < 0){
        true -> println("Negative")
        false -> println("Positive")
    }

}