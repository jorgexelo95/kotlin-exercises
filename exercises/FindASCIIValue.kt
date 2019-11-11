package exercises

fun main(args: Array<String>) {
    println("Enter a character to return its ASCII value")
    var asciiValue = readLine()!!.first().toInt()
    println(asciiValue)
}