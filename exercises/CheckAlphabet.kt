package exercises

fun main(args:Array<String>){
    var alphabet = "abcdefghijklmnopqrstuvwxyz"
    var alphaArray = alphabet.toCharArray()
    println("Enter any character")
    var char = readLine()!!.first()
    when(char in alphaArray){
        true -> println("Character is in the alphabet")
        false -> println("Character is not in the alphabet")
    }
}