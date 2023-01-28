// sealed classes: Restricted hierarchy
// sealed modifier used in front of a class behaves just like abstract but it also introduces some limitations
sealed class Role
class CoeRole(): Role()
class ManagerRole(val name: String): Role()
class WorkerRole(val name: String): Role()

fun constructLabel(role: Role): String{
    return when(role){
        is CoeRole -> "The Boss"
        is ManagerRole -> "Manager ${role.name}"
        is WorkerRole -> role.name
    }
    // no need to specify and else block similar to enum class
}

fun main(){
    val label = constructLabel(ManagerRole("Leonard"))
    println(label)   // Manager Leonard
    println(constructLabel(WorkerRole("Oscar")))    // Oscar
    println(constructLabel(CoeRole()))  // The Boss
}