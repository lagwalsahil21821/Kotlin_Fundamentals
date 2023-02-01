class SUser(val name: String)
data class XUser(val name: String)

fun main(){
//create set collection
    val set = setOf('A', 'B', 'C')
    println(set)

// as The result type is Set<T>, where T is the type of elements in this set.
    val setA :Set<Long> = setOf(1L, 3L, 5L)
    println(setA)

// Adding element to the set
    println(set + 'C') // [A, B, C]     // no duplicate element
    println(set + setOf('C', 'D')) // [A, B, C, D]
    println(setOf('Z') + set) // [Z, A, B]

//size of a set
    println("Size of set: ${set.size}")

//To check if a set is empty, you can compare its size to 0, or you can use the isEmpty method.
    println(set.size == 0) // false
    println(set.isEmpty()) // false

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // true
    println(empty.isEmpty()) // true

//Also, if you duplicate arguments in the setOf function, the second argument will be ignored.
    val setC = setOf('A', 'B', 'A')
    println(setC) // [A, B]

//Two elements are duplicated if they are equal, so if == between them returns true.
// Since regular classes are considered unique, they are never considered to be duplicates.

    val setZ = setOf(SUser("A"), SUser("A"))
    println(setZ + SUser("A")) // [User@XXX, User@YYY, User@ZZZ]

//However, data classes are equal when their all-constructor properties have the same values.
    val setX = setOf(XUser("A"), XUser("A"))
    println(setX + XUser("A")) // XUser(name= A)

// Checking if set contain the element
    println(set.contains('A')) // true
    println(set.contains('Z')) // false
    println('A' in set) // true
    println('Z' in set) // false

// iterating over sets
    for(i in set){
        println(i)
    }

// mutable sets
    val mSet = mutableSetOf('A', 'B')
    mSet.add('C')
    println(mSet) // [A, B, C]
    mSet.remove('B')
    println(mSet) // [A, C]

// or you can't access the element by indexing

}