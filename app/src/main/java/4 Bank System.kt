
fun main(){
    println("Welcome to your Banking System\nWhat type of account would you like to create")
    println("1. Debit Account\n2. Credit Account\n3. Checking\nChoose an option (1, 2 or 3)")
    var accountType = ""
    var userChoice:Int = readln().toInt()
    println("The Selected option is $userChoice")

    while(accountType == "") {
        when(userChoice) {
            1 -> accountType = "Debit"
            2 -> accountType = "Credit"
            3 -> accountType = "Checking"
            else -> {
                println("Enter valid Input !!!")
                continue
            }
        }
    }

    println("\nCongratulations! You have created $accountType account successfully")

}