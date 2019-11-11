package exercises

fun main(args: Array<String>){
    println("Enter a letter to check if vowel of consonant")
    var c = readLine()!!.first().toLowerCase()
    when(c){
        'a', 'e','i','o','u' -> println("Letter is a vowel")
        else -> println("Letter is a consonant")
    }
}