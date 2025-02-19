fun main() {
var operation =
    println("Welcome to the ultimate calculator 1000")

getDouble("Enter the 1st number:")
getString("Operation: + - * /:")
getDouble("Enter the 2nd number:")

when {

}


























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
fun getDouble(prompt:String):Int {
    var userNumber: Int?

    // Keep looping until the user types something
    while (true) {
        // Get some text from the user
        val textInput = getString(prompt)
        // Try to convert to a number
        userNumber = textInput.toIntOrNull()
        // Only leave loop if valid conversion
        if (userNumber != null) break
    }
    return userNumber!!
}

