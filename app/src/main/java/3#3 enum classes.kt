// enum: special kind of class that represents a set of possible values

enum class PaymentMethod{
    Cash,
    Card,
    Check
}

fun paymentWithCard(amount: Double): Boolean{
    println("Payment Successful of $amount ")
    return true
}

fun paymentWithCash(amount: Double): Boolean{
    println("Payment Successful of $amount ")
    return true
}

fun paymentWithCheck(amount: Double): Boolean{
    println("Payment Successful of $amount ")
    return true
}

fun pay(amount: Double, method: PaymentMethod): Boolean{
    return when(method){
        PaymentMethod.Card -> paymentWithCard(amount)
        PaymentMethod.Cash -> paymentWithCash(amount)
        PaymentMethod.Check -> paymentWithCheck(amount)
    }
    // as it cover all the payment method so no need to write else condition while using enum class
}

// enum class can also have constructor like regular class .
// But when it is defined each value needs to call it
enum class PizzaSize(val sizeInCm: Int){
    Small(15),
    Medium(20),
    Large(25),
    ExtraLarge(30)
}

fun main(){
    val success = pay(267.0, PaymentMethod.Cash)
    println("Success: $success")

// by enum class we can easily iterate over Payment Method
    for(method in PaymentMethod.values()){
        println("At ${method.ordinal} there is $method")
    }

    val printSize: PizzaSize = PizzaSize.Medium
    println("size of Medium pizza ${printSize.sizeInCm}")

}
