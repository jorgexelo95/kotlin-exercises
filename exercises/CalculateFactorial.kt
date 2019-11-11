package exercises

fun main(args: Array<String>) {
    println("Enter a number to calculate factorial")
    var num = readLine()!!.toInt()
    //var factorial = factorial(num)
    var result = 1
    for (i in num downTo 1) {
        result = result * i
    }
    println("Factorial is $result")
/*fun factorial(a: Int): Int {
    if (a == 1 || a == 0) return a
    else {
        return a * factorial(a - 1)
    }
*/
}