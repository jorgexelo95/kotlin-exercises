package exercises

fun main(args: Array<String>) {
    println("Enter first integer")
    var str = readLine()
    var num1 = str?.toInt()
    println(num1)
    println("Enter another integer")
    str = readLine()
    var num2 = str?.toInt()
    println("Sum is ${add(num1!!, num2!!)}")

}

fun add(a: Int, b: Int): Int {
    return a + b
}