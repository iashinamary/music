fun main() {
    val totalPrice = 50_000
    val isRegularCustomer = true
    var discount = 100

    var result = if (totalPrice <= 1000){
        totalPrice
    } else if (totalPrice<=10_000){
        totalPrice - discount
    } else {
        totalPrice - (totalPrice * 0.05).toInt()
    }

    if (isRegularCustomer){
        result -= (result * 0.01).toInt()
    }

    println(result)
}