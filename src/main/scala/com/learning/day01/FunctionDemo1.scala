package com.learning.day01

object FunctionDemo1 {
    def main(args: Array[String]): Unit = {
        val res = f2(2, 3, /*匿名函数*/(a, b) => a * b)
        println(res)
    }

    def f2(a: Int, b: Int, f: (Int, Int) => Int) = {
        f(a, b)
    }
}
