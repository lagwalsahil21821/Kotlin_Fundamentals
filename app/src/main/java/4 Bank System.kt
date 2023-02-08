var balance = 50000 // initial balance
var accountType = ""
var money: Int = 0
fun withdraw(amount: Int):Int{
    balance -= amount
    println("You successfully withdrew $amount dollars. The current balance is $balance dollars.")
    return amount
}
fun debitWithdraw(amount: Int):Int{
    if(amount == 0){
        println("Can't withdraw. No money on this account!!!")
        return balance
    } else if(amount > balance){
        println("Not Enough money on this account!!! \nThe current balance is $balance dollars.")
        return 0
    }else{
        balance -= amount
        println("You successfully withdrew $amount dollars. The current balance is $balance dollars.")
    }
    return amount
}

fun deposit(amount: Int):Int{
    balance += amount
    println("You successfully deposited $amount dollars. The current balance is $balance dollars.")
    return amount
}


fun creditDeposit(amount: Int):Int{
    if(amount == 0){
        println("Account is completely paid off! Do not deposit money!!!")
        return balance
    }else if(amount + balance > 0){
        println("Deposit failed, you tried to pay off an amount greater than the credit balance. The current balance is $balance dollars.")
        return 0
    }else if(amount == -balance){
        balance = 0
        println("you have paid off this account!!!")
        return amount
    }
    else{
        return deposit(amount)
    }
}

fun transfer(mode: String){
    val transferAmount: Int

    when(mode){
        "withdraw" -> {
            if(accountType == "Debit"){
                transferAmount = debitWithdraw(money)
            }else{
                transferAmount = withdraw(money)
            }
            println("The amount you withdrew is $transferAmount dollars.")
        }
        "deposit" -> {
            if(accountType == "Credit"){
                transferAmount = creditDeposit(money)
            }else{
                transferAmount = deposit(money)
            }
            println("The amount you deposit is $transferAmount dollars")
        }
        else -> return

    }
}

fun main(){
    println("Welcome to your Banking System\nWhat type of account would you like to create")
    println("1. Debit Account\n2. Credit Account\n3. Checking\nChoose an option (1, 2 or 3)")

    var userChoice = 0

    while(accountType == "") {
        userChoice = readln().toInt()
        println("The Selected option is $userChoice")
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


// part 2

    println("The current account balance is $balance dollars")
    println("Enter amount to be transferred: ")
    money = readln().toInt()
    println("The amount you transferred is $money dollars")

// part 3
    println("*****---------*****\n")

    var isSystemOpen = true
    var option = 0

    while(isSystemOpen == true){
        println("\nWhat would you like to do? ")
        println("1. Check Account Balance")
        println("2. Withdraw Money")
        println("3. Deposit Money")
        println("4. Close the System")
        println("Which option do you choose? (1, 2, 3 or 4)")
        option = readln().toInt()

        when(option){
            1 -> println("The current balance is $balance dollars.")
            2 -> transfer("withdraw")
            3 -> transfer("deposit")
            4 -> {
                isSystemOpen = false
                println("The system is closed")
            }
            else -> continue
        }
    }


}