package com.atguigu.day02.chapter01

object Extends {
    def main(args: Array[String]): Unit = {
        // 子类可以继承父类的属性和方法
        val emp = new Emp()
        emp.name = "zhangsan"
        println(emp.name)
        emp.m1()
    }
}

class Person() {

    println("constractor")

    var name: String = "lisi"

    def m1() = {
        println("Person method")
    }
}

class Emp() extends Person() {
    println("Emp method" + name)
    super.m1()
    override def m1(): Unit = {
        println("Emp method" + name)
    }
}
