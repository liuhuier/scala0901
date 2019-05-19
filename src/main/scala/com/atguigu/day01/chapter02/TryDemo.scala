package com.atguigu.day01.chapter02

object TryDemo {
    def main(args: Array[String]): Unit = {
        try {
            val a = 10
            val b = 0
            println(a / b)
        } catch {
            case ex: Exception => println("算数异常")
            case _ => "其它异常"
        } finally {
            println("finally...")
        }

    }
}
