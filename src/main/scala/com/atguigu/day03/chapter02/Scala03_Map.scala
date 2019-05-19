package com.atguigu.day03.chapter02

import scala.collection.mutable

object Scala03_Map {
    def main(args: Array[String]): Unit = {
        // 构建不可变Map
        val map1 = Map("zhangsan" -> 10, "lisi" -> 20, "wangwu" -> 30)
        // println(map1)

        // 构建可变Map
        val map2 = mutable.Map("zhangsan" -> 10, "lisi" -> 20, "wangwu" -> 30)
        println(map2)

        // 构建可变Map
        val map3 = new mutable.HashMap[String, Int]()
        // println(map3)

        // 取值
        // println(map2.getOrElse("zs", 1))

        // 更新元素值
        map2("lisi") = 100
        println(map2)
    }
}
