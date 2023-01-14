fun main(){
    var toBePrinted = 0

//while loop: similar to if condition, repeats until the condition becomes false
    while (toBePrinted <= 2) {
        println("value is $toBePrinted")
        toBePrinted++
    }
    println()

    // -----------------***************--------------------
    // -----------------for loop---------------------------
//sequence of squares
    println("Sequence of Squares: ")
    var i = 1
    while(i*i <= 100){
        println(i*i)
        i++
    }


//for loop
    val a = listOf("A","B","C")
    for(letter in a){
        println("The next letter is $a")
    }

// for loop with range
    println("for loop from 1 to 5")
    for(i in 1..5){
        println(i)
    }
    println()

// Until: not print extreme case
    println("for loop with until keyword:")
    for(i in 1 until 5){
        println(i)
    }
    println()

// step
    println("for loop with increment 2")
    for(i in 1..5 step 2){
        println(i)
    }
    println()

//reverse
    // 5..1 wrong way
    println("for loop in reverse:")
    for(i in 5 downTo 1){
        println(i)
    }
}