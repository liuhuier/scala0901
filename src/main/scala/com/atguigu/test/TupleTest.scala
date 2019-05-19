package com.atguigu.test

object TupleTest {
    def main(args: Array[String]): Unit = {
        val t1 = (1, "scala", true, 2.5)
        // println(t1._4) // 2.5
        // println(t1) // (1,scala,true,2.5)

        // 遍历元组方式一
        for (elem <- t1.productIterator) {
            // println(elem)
        }
        // 遍历元组方式二
        // t1.productIterator.foreach(println)

        // 隐式转换 val a: Int = 2.5
        // 将double类型隐式转换为Int类型

        // 隐式函数必须加implicit关键字
        implicit def func(d: Double): Int = {
            d.toInt
        }
        val aaa: Int = 2.5
        println(aaa)
    }
}
