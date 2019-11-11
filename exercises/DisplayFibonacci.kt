package exercises

fun main(args: Array<String>){
    println("Enter a number")
    var num = readLine()!!.toInt()
    var fib1 = 0
    var fib2 = 1
    var n = 1

    print("Fibonacci series is: ")
    while(n <= num){
        print("+ $fib1 ")
        var sum = fib1 + fib2
        fib1 = fib2
        fib2 = sum
        n++
    }

}