fun main(){
    // When condition
    val password = "abc"
    when{
        password == "" -> {
            println("Password can not be empty!!!")
        }
        password.length < 7 -> {
            println("This password is too short.")
        }
        else -> {
            println("Password is OK")

        }
    }

//when as an expression
    val textToShow = when{
        password == "" -> "Password can not be empty!!!"
        password.length < 7 -> "This password is too short."
        else -> "Password is OK"
    }
    println(textToShow)

// when with the value
    var num = 1
    when(num){
        1 -> println("Missed Hit")
        2,3,4,5 -> println("Hit with value $num")
        6 -> println("critical Hit")
        else -> println("unsupported Value")
    }

// when with value as expression
    var text = when (num){
        1 -> "Missed Hit"
        2,3,4,5 -> "Hit with value $num"
        6 -> "critical Hit"
        else -> "unsupported Value"
    }
    println(text)

// using ranges
    num = 3
    text = when (num){
        1 -> "Missed Hit"
        in 2..5 -> "Hit with value $num"
        6 -> "critical Hit"
        else -> "unsupported Value"
    }
    println(text)

//is statement

    val something: Any = "ABC"
    when(something){
        is String -> println("This is String")
        is Int -> println("This is Int")
        is Double -> println("This is Double")
        is Boolean -> println("This is Boolean")
    }

// exercise
    val d = "Friday"
    when{
        d == "Monday" -> println("Open 8AM to 12PM")
        d == "Tuesday" -> println("Open 8AM to 6PM")
        d == "Wednesday" -> println("Open 8AM to 6PM")
        d == "Thursday" -> println("Open 8AM to 6PM")
        d == "Friday" -> println("Open 8AM to 9PM")
        d == "Saturday" -> println("Open 9AM to 4PM")
        d == "Sunday" -> println("Open 8AM to 4PM")
        else -> println("Enter Valid input!!!")
    }

}


