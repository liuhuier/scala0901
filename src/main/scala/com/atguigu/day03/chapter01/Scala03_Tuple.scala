package com.atguigu.day03.chapter01

/**
  * Tuple: 元组,可以理解为一个容器,用于存放各种相同或者不同的类型
  * 说的简单点,就是将多个无关的数据封装为一个整体
  */
object Scala03_Tuple {
    def main(args: Array[String]): Unit = {
        val tuple1 = (1, "hello scala", true, 2.5)

        // 取值
         println(tuple1._4)

        // 遍历tuple
        for(i <- tuple1.productIterator) {
            // println(i)
        }

        val list = List(1, 2)
        // println(list) // List(1, 2)

        val list2 = list :+ 3
        // println(list2)

        val list3 = 3 :: 4 :: list
        println(list3) // List(3, 4, 1, 2)

    }
}
