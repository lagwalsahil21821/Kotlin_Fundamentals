// Annotation: to embed supplemental info a into a source file
// used to describe your code
// annotation by itself does absolutely nothing


@Throws(ArithmeticException::class)
fun divide(a: Int, b: Int): Int{
    return a/b
}


@MyAnnotation("class Annotation")
class A(
    @MyAnnotation("Constructor Property Annotation")
    val a: Int
){
    @MyAnnotation("Method Annotation")
    fun b(){}
}

fun main(){
    val a = A(23)
    print(a)
}