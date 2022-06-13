package oop

open class Person(val firstName: String = "John", val lastName: String = "Smith", var age: Int = 39) {

    open val id: String

    init {
        id = "$fullName $age"
    }

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', age=$age)"
    }

    val fullName: String
        get() = "$firstName $lastName"

}