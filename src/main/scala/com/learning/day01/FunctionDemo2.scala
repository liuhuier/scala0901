package com.learning.day01

object FunctionDemo2 {

    def main(args: Array[String]): Unit = {
        def f1() = {
            println("Hello World")
        }

        // 调用函数f1
        // f1

        // 将函数赋值给变量,变量类型是函数
        var v1 = f1 _
        // 调用方法
        // v1()

        def f2() = {
            f1 _
        }
        // f2()()

        var v2 = f2 _
        v2()()

        val a: Int = 10
        a

    }
}
