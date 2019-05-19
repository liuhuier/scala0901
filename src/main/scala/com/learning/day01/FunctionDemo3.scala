package com.learning.day01

object FunctionDemo3 {
    def main(args: Array[String]): Unit = {
        val i = f2 _
        i()(2)

        this.f1(1)
    }

    def f1(a: Int) = {
        println("f1 ...")
    }

    def f2() = {
        f1 _
    }
}
