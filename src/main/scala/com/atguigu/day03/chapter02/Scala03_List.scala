package com.atguigu.day03.chapter02

object Scala03_List {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3)
        val it = list.iterator
        for(i <- it) {
            // println(i)
        }

        // 并行集合
        (1 to 10).par.foreach(println)
    }
}
