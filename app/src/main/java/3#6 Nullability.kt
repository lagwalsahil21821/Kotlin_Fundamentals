// Nullability: To use this question mark is added after the type like -> String?
// String? or anotherType? : indicates that the value can either be null or string or any specific type

class UserA(val name: String)


// also used in parameter
fun processUser(user: User?){}

// Null pointer Exception: if you try to access a property or function on a
// variable that is currently a null value it will cause NPE




fun main(){
    var i: Int? = null
    var user: UserA? = null
    processUser(null)

// NPE
    var message: String? = "Hello World"
    message = null

/*
this stmt says to use safe or not null assertion:-
var length = message.length         // will cause NPE
*/


/*
 To avoid NPE we use either
1. Safe call        2. Not Null Assertion       3. Smart Casting        4. Elvis Operator
 */

//1.  safe call : use "?." -> it calls the right side only if left side is not null.
//                         other wise it does nothing & returns null

    message = "Hello World"
    println(message?.length)     // 11
    println(message?.uppercase()) // HELLO WORLD
    message = null
    println(message?.length)    // it will print null (no npe)

//2. Not Null Assertion: used by "!!." (unsafe call)-> if value is null then it will throw an exception

//3. Smart Casting: add a condition & it allows for treating a variable as not null
    message = "Hello Bro"
    if(message != null){
        var length = message.length
        println("length of Hello Bro -> $length")     // 9
        message = null
    }else{
        println(null)
    }

//4. Elvis Operator: used by "?:" -> provide default value when the value is Null
    fun printUserName(user: User?){
        val userWithDefault = user ?: User("(undefined)")
        println(userWithDefault.name)
    }

    printUserName(null)



}