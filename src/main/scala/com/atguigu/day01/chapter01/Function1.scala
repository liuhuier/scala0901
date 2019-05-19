package com.atguigu.day01.chapter01

object Function1 {
    def main(args: Array[String]): Unit = {
        val a = f1 _
        a("zs")

        val c: String = "2"
        val b = () => "nu"
        println(b())
    }

    def bb(a: Int, b: Int) = {
        "nu"
    }

    def f1(a: String) = {
        println("f1 ...")
    }
}
