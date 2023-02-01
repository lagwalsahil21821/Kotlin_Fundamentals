fun main(){
// create a map: using pair or by "to" keyword
    val map = mapOf(
        Pair("USA", "Washington"),
        Pair("Poland", "warsaw"),
        Pair("India", "Delhi")
    )

    // val capitals = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")

// The result type is Map<K, V>, where K is the type of a key, and V is the type of the value.
    val capitals: Map<String, String> = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")

    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)

    println(alphabet) // {A=1, B=2, C=3}

// finding value for the key
    //use a box bracket with the key
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null

//Adding elements to a map
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Bob, C=Celina}
    val map3 = mapOf('D' to "Daniel", 'E' to "Ellen")
    val map4 = map2 + map3
    println(map3) // {D=Daniel, E=Ellen}
    println(map4) // {A=Alex, B=Bob, C=Celina, D=Daniel, E=Ellen}


// Beware that duplicated keys are not allowed, so when you add a new association, it removes the old one.
    println("See recent entry is there for duplicate:")
    var map5 = map2 + ('B' to "Benzma")
    println(map2) // {A=Alex, B=Bob}
    println(map5) // {A=Alex, B=Barbara}

    println()
// You can also remove certain keys from a map using the minus sign.
    map5 = map5 - 'C'
    println(map5)

//Checking if a map contains a key
    println('A' in map5) // true
    println('Z' in map5) // false

// map size
    println("Size of the map: ${map5.size}")

// iterating over map
    for (entry in map) {
        println("${entry.key} is for ${entry.value}")
    }

//You can also restructure an entry into two variables
    for ((letter, name) in map) {
        println("$letter is for $name")
    }

// Mutable map
    // You can add new associations to it using the put method or box bracket and assignment
    val mapA: MutableMap<Char, String> = mutableMapOf('A' to "Alex", 'B' to "Bob")
    mapA.put('C', "Celina") // prefer to use assignment
    mapA['D'] = "Daria"
    println(mapA) // {A=Alex, B=Bob, D=Daria, C=Celina}
    mapA.remove('B')
    println(mapA) // {A=Alex, D=Daria, C=Celina}



}