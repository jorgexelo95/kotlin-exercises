package exercises

import kotlin.math.pow
import kotlin.math.sqrt

fun main(args:Array<String>){
    println("Enter a number for a")
    var a = readLine()!!.toDouble()
    println("Enter a number for b")
    var b = readLine()!!.toDouble()
    println("Enter a number for c")
    var c = readLine()!!.toDouble()
    roots(a, b, c)

}

fun roots(a:Double, b:Double, c:Double){

    var tempPos = (-b + sqrt(b.pow(2)-4*a*c))/(2*a)
    var tempNeg = (-b - sqrt(b.pow(2)-4*a*c))/(2*a)

    println("Roots are $tempPos and $tempNeg")
}