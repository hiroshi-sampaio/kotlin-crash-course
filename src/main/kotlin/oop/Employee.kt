package oop

class Employee(
    var company: String,
    firstName: String = "John",
    lastName: String = "Smith",
    age: Int = 39
) : Person(firstName, lastName, age) {
    override val id = ""
}
