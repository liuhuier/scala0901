package com.atguigu.day01.chapter01

/**
  * scala中任何语法结构都有类型和值
  * Object: 单例对象 静态对象
  */
object IfTest1 {

    val forRes1 = for(a <- 1 to 5 if a % 2 != 0) {
        println(a)
    }
    println("====")

    def main(args: Array[String]): Unit = {

        // 创建变量
        val a = 2

        // if结构的返回值就是if语句的最后一行
        val ifRes = if (a > 1) {
            a
            "scala"
        } else {
            0
        }
        // println(ifRes)

        // for循环的返回值类型是Unit --> ()
        val forRes = for(a <- 1 to 5 if a % 2 == 0) {
            println(a)
        }
        println(forRes)

    }

    val forRes = for(a <- 1 to 5 if a % 2 == 0) {
        println(a)
    }
    println("----")
}
