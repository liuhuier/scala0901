package com.atguigu.day03.chapter02

object Scala03_Zip {
    def main(args: Array[String]): Unit = {
        val list1 = List("1", "2", "3")
        val list2 = List(4, 5, 6, 7)
        var z1 = list1 zip list2
        println(z1)

    }
}
