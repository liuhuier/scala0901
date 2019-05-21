package com.learning.day04

object ConvertDemo {
    def main(args: Array[String]): Unit = {
        val person: Person = new emp
        println(person.name)
        if (person.isInstanceOf[emp]) {
            val emp = person.asInstanceOf[emp]
            println(emp.name)
        } else if (person.isInstanceOf[student]) {
            val student = person.asInstanceOf[student]
            println(student.name)
        }
    }
}

class Person {
    val name = "person..."
}

class emp extends Person {
    override val name = "emp"
}

class student extends Person {
    override val name: String = "student"
}
