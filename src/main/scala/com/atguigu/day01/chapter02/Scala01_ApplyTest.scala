package com.atguigu.day01.chapter02

object Scala01_ApplyTest {
    def main(args: Array[String]): Unit = {
        // 调用构造器时会调用类中的所有语句
        val person = Person("zhangsan", 10, "is male")
        println(person.name + " " + person.age)

        // 调用函数
        // println(person.f1())

    }
}

class Person(val name: String, var age: Int, sex: String) {
    println("构造器")
    println("-------")

    val newName: String = "wangwu"

    def f1() = {
        println("函数调用时才会执行")
        println(sex)
        "最后一行代码作为函数的返回值"
    }

    println(sex)

    // 访问伴生对象的私有属性和私有方法
    println(Person.salary)
    Person.sports("lisi")

    // 私有属性和方法
    private val newAge = 20
}

object Person {

    // 伴生类和伴生对象可以互相访问对方的属性和方法,包括私有属性和方法
    private val salary = 20000

    private def sports(name: String = "messi") = {
        println(name + "在运动")
    }

    // apply方法
    def apply(name: String, age: Int, sex: String) = {
        new Person(name, age, sex)
    }

    // 访问伴生类的私有属性和方法
    private val person = Person("zhaoliu", 100, "female")
    println(person.newAge)
}