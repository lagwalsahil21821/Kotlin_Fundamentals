class Subject(
    val name: String,
    val teacher: Teacher,       // Note: here property type is **Teacher** i.e. another class so
                                //       now someone who has access to an abject of type **Subject**
                                //       can also read the property of the teacher teaching the subject.
    val isObligatory: Boolean
)

class Teacher(
    val id: Int,
    val name: String,
    val surname: String,
    val dob: String,
    val status: String
)

fun main(){
    val regriuszFrost = Teacher(id = 101, name = "Regriusz", surname = "Frost", dob = "19.06.1978", status = "Active")
    val biology1 = Subject(name = "Biology 1", teacher = regriuszFrost, isObligatory = true)
    println(biology1.isObligatory)
    println(biology1.teacher.dob)
    println(biology1.teacher.status)

}

