// Program to check if a number is positive, negative, or zero using if-else
fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (number > 0) {
        println("Positive number")
    } else if (number < 0) {
        println("Negative number")
    } else {
        println("The number is zero")
    }
}
