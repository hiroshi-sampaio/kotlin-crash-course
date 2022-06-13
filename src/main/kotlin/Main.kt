import oop.Person

// functions can be at the package level
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val banana = "Banana" // immutable
    println(banana)

    var apple: String = "Apple" // variable
    apple = "apple"
    println(apple)

    // Kotlin -> static typed language


    // Very big improvement over Java - Null
    var s: String? = "string"
    s = null
    s = "kotlin"

    // String templates
    println()
    println("String templates")
    println("Hello, $s")
    println("${1 + 154}")


    // Arrays
    println()
    println("Arrays")

    val arr = arrayOf(1, 2, 3)

    println(arr[0])

    // primitive types arrays
    // does not inherit from array of objects
    val ints = intArrayOf(10, 20, 30)



    println()
    println("Control structures")

    // Conditional branches
    print("Please tell us your age: ")
    val age = Integer.valueOf(readLine())
    val message = if (age >= 18) "You are allowed to drink!" else "You are not allowed to drink!"
    println(message)

    print("What day is today? ")
    val day = readLine()
    val food = when (day) {
        "Monday", "Wednesday" -> "Chicken"
        "Friday", "Tuesday" -> "Salmon"
        "Sunday" -> "Steak"
        else -> "Bacon"
    }
    println("I want to eat $food")

    val fruit = when {
        day != "Monday" && (food == "Chicken" || food == "Steak") -> "Apple"
        else -> "Banana"
    }
    println("I want to eat $fruit")


    val list = listOf("Kotlin", "Java", "Python")
    val map = mapOf(1 to "Kotlin", 2 to "Java", 3 to "Python")

    for (a in ints) print(a)
    println()

    for (a in list) print(a)
    println()

    for ((k, v) in map) println("$k => $v")

    // .. / until
    for (i in 1 until 9 step 2) print(i)
    println()

    for (i in 9 downTo 2) print(i)
    println()


    println()
    println("Extension function")

    fun String.getEmotion(): String {
        return when {
            last() == '!' -> "Exciting"
            last() == '?' -> "Curious"
            last() == '.' -> "Calm"
            else -> "Unidentified"
        }
    }

    val question = "How are you?"
    println(question.getEmotion())

    // There is no "Kotlin SDK" - most libraries are extension functions on top of Java library classes


    println()
    println("Objects")

    val p1 = Person()
    println("Name: ${p1.firstName}, last name: ${p1.lastName}, age: ${p1.age}")
    println(p1.fullName)


    val p2 = Person("Hiroshi", "Sampaio", 39)
    println(p2)

}