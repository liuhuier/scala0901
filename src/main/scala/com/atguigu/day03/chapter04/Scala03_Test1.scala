package com.atguigu.day03.chapter04

/**
  * 如何用reduceLeft得到数组Array(1,333,4,6,4,4,9,32,6,9,0,2)中的最大元素?
  */
object Scala03_Test1 {
    def main(args: Array[String]): Unit = {
        val array = Array(1, 3, 4, 6, 4, 4, 9, 32, 6, 9, 0, 2)
        // def reduceLeft[B >: A](op: (B, A) => B): B
        val res = array.reduceLeft((a, b) => {
            if (a > b) {
                a
            } else {
                b
            }
        })
        println(res)
    }
}
