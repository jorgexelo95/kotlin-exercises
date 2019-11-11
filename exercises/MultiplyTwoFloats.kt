package exercises

fun main(args: Array<String>) {
    println("Enter a float number")
    var float1 = readLine()!!.toFloat()
    println("Enter another float number")
    var float2 = readLine()!!.toFloat()
    println("Your product is ${multiplyFloat(float1, float2)}")

}

fun multiplyFloat(a: Float, b: Float): Float {
    return a * b
}