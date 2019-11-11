package exercises

fun main(args: Array<String>) {
    println("Enter a number")
    var num = readLine()!!.toInt()
    println("Enter a second number")
    var num2 = readLine()!!.toInt()
    quoRemain(num, num2)

}

fun quoRemain(a: Int, b: Int) {
    println("Quotient is : ${a / b} and remainder is: ${a % b}")
}