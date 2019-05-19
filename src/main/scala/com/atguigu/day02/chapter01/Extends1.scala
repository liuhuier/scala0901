package com.atguigu.day02.chapter01

object Extends1 {
    def main(args: Array[String]): Unit = {
        val person: Person1 = new Student
        println(person.test) // 2
        printNo(person)
    }

    def printNo(person: Person1) = {
        if (person.isInstanceOf[Emp1]) {
            val emp = person.asInstanceOf[Emp1]
            println(emp.empno)
        } else if (person.isInstanceOf[Student]) {
            val student = person.asInstanceOf[Student]
            println(student.sno)
        }
    }
}

class Person1 {
    val test = 1
    protected val name = "zhangsan"
    // private val name = "zhangsan"
}

class Emp1 extends Person1 {
    override val test = 2
    val empno = 40
}

class Student extends Person1 {
    override val test = 3
    val sno = 20
}
