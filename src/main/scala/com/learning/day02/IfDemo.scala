package com.learning.day02

object IfDemo {


    def main(args: Array[String]): Unit = {

        BigInt.probablePrime(16, scala.util.Random)

        val res = for (i <- 1 to 10; if i % 2 == 0) yield i
        // println(res)

        lazy val msg = f10()

        // msg

        try {
            var r = 10 / 0
        } catch {
            case ex: Exception => println("捕获了异常")
        } finally {
            println("最终要执行的代码")
        }

    }

    def f10() = {
        println("f10方法执行")
    }

}
