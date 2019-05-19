package com.atguigu.day03.chapter02

import scala.collection.mutable

/**
  * 小应用：使用映射集合，统计一句话中，各个文字出现的次数
  */
object Scala03_Test {
    def main(args: Array[String]): Unit = {
        val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"

        /**
          * def charCount( map : Map[Char, Int], c : Char ): Map[Char, Int] = {
          * map + (c -> (map.getOrElse(c, 0) + 1))
          * }
          */

        // 第二种
        val res = sentence.foldLeft(mutable.Map[Char, Int]())((m, c) => {
           m += (c -> (m.getOrElse(c, 0) + 1))
        })

        // println(res)

        // 第一种
        /*var map = new mutable.HashMap[String, Int]()
        for (i <- sentence) {
            if (map.contains(i.toString)) {
                val res = map.getOrElse(i.toString, 0)
                map(i.toString) = res + 1
            } else {
                map += (i.toString -> 1)
            }
        }
        println(map)*/
    }
}
