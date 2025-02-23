fun main() {

    println("Welcome to the ultimate calculator 9000")

val num1= getDouble("Enter the 1st number:")
var operation= getOperation("Operation: + - * /:")
val num2=getDouble("Enter the 2nd number:")

when {
    operation == ('+') -> (num1+num2)
    operation == ('-') -> (num1-num2)
    operation == ('*') -> (num1*num2)
    operation == ('/') -> (num1/num2)

    /**
     * operation = + -> (first number + second number)
     * repeat for each operation
     */

}


}
fun calculate(num1: Double, num2: Double): Double {
    var result= 0.0
    when {
         ('+') -> result = (num1+num2)
         ('-') -> (num1-num2)
          ('*') -> (num1*num2)
          ('/') -> (num1/num2)
}


/**
function to get a string from the user**/
fun getString(prompt:String):String {
    var userinput: String

    // Keep looping until the user types something
    while (true) {
        print(prompt)
        userinput = readln()
        if (userinput.isNotBlank()) break
    }

    return userinput
}


/**
function to get int from user**/
fun getDouble(prompt:String):Double {
    var userNumber: Double?

    // Keep looping until the user types something
    while (true) {
        // Get some text from the user
        val textInput = getString(prompt)
        // Try to convert to a number
        userNumber = textInput.toDoubleOrNull()
        // Only leave loop if valid conversion
        if (userNumber != null) break
    }
    return userNumber!!
}

fun getOperation(prompt: String): Char {
    var input: String?

    // Keep looping until the user types something
    while (true) {
        input = getString(prompt)
        if ("+-*/".contains(input))
            break
    }

    return input.first()
}

