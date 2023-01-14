
fun main(){
    println("hello world")
    var a = "this is fucking insane"
    a = "what??"
    val b = "hey"
    val age: String = "" + 42 + "!"
    println(a)
    println(age)

// variable and types
    println(123 + 456 * 789)
    println(13530.0 / 1.23)

    val a1 = 88
    val b1 = 32
    val c1 = 55
    val totalScore = a1+b1+c1
    println("Score: $totalScore")
    val average = totalScore/3;
    println("Average: $average")

    println()
    println("strings:")
    val myString = "Hello"
//searching
    val startWithHel = myString.startsWith("hel")
    println(startWithHel)

    val endWithLo = myString.endsWith("lo")
    println(endWithLo)

    val firstChar = myString.first()
    println(firstChar)

    val lastChar = myString.last()
    println(lastChar)

//manipulating
    val stringUpper = myString.uppercase()
    println(stringUpper)

    val stringLower = myString.lowercase()
    println(stringLower)

//get all the character from the index onward
    val myString2 = myString.substring(1)
    println(myString2)


    println()


}