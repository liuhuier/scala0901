package com.atguigu.day01.chapter01

object RecursionTest {
    def main(args: Array[String]): Unit = {
        println(func(4))
    }
    // 递归调用
    def func(i: Int): Int = {
        // if表达式是有返回值的
        if (i > 0) {
            i * func(i - 1)
        } else {
            1
        }
    }
}

/**
  * if表达式是有返回值的,返回值类型就是表达式的最后一行值的类型
  */
object IfTest {
    def main(args: Array[String]): Unit = {
        val flg = true
        val res = if (flg) {
            "true"
        } else {
            println("false")
        }
        println(res)
    }
}
