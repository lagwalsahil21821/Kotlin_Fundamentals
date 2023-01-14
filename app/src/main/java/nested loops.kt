import android.os.Build.VERSION_CODES.P

fun main(){
    /* to print

    *
    **
    ***
    ****
    *****

     */
    for(i in 1..5){
        for(j in 1..i){
            print("*")
        }
        println()
    }

    // print pattern in reverse
    println()
    for(i in 1..5){
        for(j in 1..(6-i)){
            print("*")
        }
        println()
    }

    // other way
    for(i in 1..5){
        for(j in 5 downTo i){
            print("*")
        }
        println()
    }


    /* now print

                 *
                **
               ***
              ****
             *****
     */
    println("new pattern")
    for (i in 1..5){
        for(j in 1..(5-i) ){
            print(" ")
        }
        for(j in 1..i){
            print("*")
        }
        println()
    }

    println("triangle pattern:")
    for (i in 1..5){
        for(j in 1..(5-i) ){
            print(" ")
        }
        for(j in 1 until (2*i) ){
            print("*")
        }
        println()
    }

    /*
            *****
             ****
              ***
               **
                *
     */
    println()
    println("L in reverse: ")
    for (i in 1..5){
        for(j in 1 until i){
            print(" ")
        }
        for(j in 1..(6-i)){
            print("*")
        }
        println()
    }


    /*
            *********
             *******
              *****
               ***
                *
     */
    println()
    println("Triangle in reverse: ")
    for(i in 1..5){
        for(j in 1 until i){
            print(" ")
        }
        for(j in 1..(11 - 2*i)){
            print("*")
        }
        println()
    }
}