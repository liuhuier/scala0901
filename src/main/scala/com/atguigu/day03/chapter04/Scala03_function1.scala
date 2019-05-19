package com.atguigu.day03.chapter04

object Scala03_function1 {

    def main(args: Array[String]): Unit = {

        val intToString: Int => String = (a: Int) => a.toString

        val intToString2 = intToString

        // println(intToString2(2)) // <function1>

        // println(intToString2) // <function1>

        // 调用函数
        // println(intToString(1)) // 1

        // 匿名函数
        val x1 = (d: Double) => d * d * d
        // println(x1(2))


        // 变成方法
        def x2(d: Double): Double = {
            d * d * d
        }

        // println(x2(2))

        val list = List(1, 2, 3, 4)
        println(list.map(_ * 2))
    }
}
