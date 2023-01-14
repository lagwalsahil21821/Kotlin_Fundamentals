fun triangleArea(width: Double, height: Double):Double{
    return width * height /2
}
fun biggerOf(a:Int, b: Int): Int{
    return if(a>b) a else b
}


//imp
// these are single line function so you can also declare them like:
fun biggerOf1(a:Int,b:Int):Int = if(a>b) a else b
fun triangleArea1(width:Double , height: Double):Double = width*height/2

//exercise
fun totalScore(score:Int,boost:Int):Int = score * boost

fun main(){
    print("Area of Triangle: ")
    println(triangleArea(10.0,5.0))

    println(biggerOf(10,4))
    println(biggerOf1(7,14))
    println(triangleArea1(12.0,6.0))


//exercise
    println()
    println("Scores:")
    var score = 0
    score += totalScore(10,2)
    println(score)
    score += totalScore(20,1)
    println(score)

}