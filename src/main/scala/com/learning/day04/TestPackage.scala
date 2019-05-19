package com.learning.day04

// 包语句
package demo1 {

    object TestPackage {
        println(name)
        println("--------")

        def main(args: Array[String]): Unit = {
            println(name)
        }
    }
}

// 包对象
package object demo1 {
    val name = "zhangsan"
}