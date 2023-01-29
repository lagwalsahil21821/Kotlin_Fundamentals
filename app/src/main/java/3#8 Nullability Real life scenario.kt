
data class Student(val id: Int, val name: String, val grade: Double)

val students = listOf<Student>(
    Student(223,"John",140.0),
    Student(548,"Mark",120.0),
    Student(342,"Natali",150.0),
    Student(781,"Sara",130.0)
)


// as every student has its id so no need of ?
fun getStudentById(id: Int):Student{
    return students.find { it.id == id } !! // assertion operator: it will throw exception if id is not present in database


}

fun searchInStudent(name: String):Student?{
    return students.find{ it.name.lowercase() == name.lowercase()}
}

fun main(){
    println("Please, Enter the ID of the student:")
    val id: Int= readln().toInt()
    println(getStudentById(id) )

    println("Please, Enter the student's name:")
    val name= readln()
    println(searchInStudent(name) ?: "The Student is not Found!!!")     //elvis operator


}