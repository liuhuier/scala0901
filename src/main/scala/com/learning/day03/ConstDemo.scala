package com.learning.day03

object ConstDemo {
    def main(args: Array[String]): Unit = {
        val person = new Person()

    }
}

// 主构造器
// 执行主构造器时，类体中所有语句都会执行，类体相当于方法体
// 主构造器的参数相当于成员变量
class Person private (val name: String = "zhangsan", var age: Int, sex: String) {
    println(s"name: $name, age: $age, sex: $sex")

    println("------1-------")
    // 辅助构造器
    def this() = {
        // 首先调用主构造器
        this("zs", 10, "female")
        println("辅助构造器执行了")
    }

    println("------2-------")
}
