class MyError: Throwable("Some message")

fun someFunction() {
    throw MyError()
    println("Will not be printed")
}

fun findClusters(number: Int) {
        if (number < 1) throw IllegalArgumentException("The number of clusters cannot be smaller than 1, it is $number")
         // ...
}

var userName = ""

fun printUserName() {
        if (userName == "") throw IllegalStateException("User name must not be empty")
        // ...
}

fun main() {
//Inside try, you can also use a block called finally.
// It is used to specify a block of code that should always be invoked,
// even if an exception occurs. Take a look at the code below.
// Inside someFunction an exception is thrown.
// It ends the function, and it ends the body of try.
// Since you do not have catch block, this exception will not be caught,
// and it will end the 'main' function.
// However, there is the finally block that is invoked even if an exception occurs.
        try {
        someFunction()
        println("Will not be printed")
        } finally{
                println("Always executed")
        }

}