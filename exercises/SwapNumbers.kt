package exercises

fun main(args: Array<String>) {
    println("Enter a number")
    var num = readLine()!!.toInt()
    println("Enter a second number")
    var num2 = readLine()!!.toInt()
    println("Numbers entered are $num and $num2")
    var temp = num
    num = num2
    num2 = temp
    println("Swapped numbers are $num and $num2")
}