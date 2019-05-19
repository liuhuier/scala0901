package com.atguigu.day03.chapter04

object Scala03_function2 {
    def main(args: Array[String]): Unit = {

        /**
          * 闭包就是一个函数把外部的那些不属于自己的对象也包含(闭合)进来
          *
          * @param x
          * @return function
          */
        def minusxy(x: Int) = {

            // 声明了函数但是没有返回
            def test(y: Int): Int = {
                x - y
            }

            test _

            //val f = (x: Int) => x.toString + " hello"
            //f

            def test2(y: Int): Int = {
                x - y
            }

            // Unit

        }

        // println(minusxy(2)(5))
    }
}

/**
  * 闭包
  */
object Test {
    // 匿名函数(y: Int) => x + y引用了外部的变量x
    def minusxy(x: Int) = (y: Int) => x + y

    def main(args: Array[String]): Unit = {
        val intToInt: Int => Int = minusxy(3)
        val res = intToInt(2)
        println(res)
    }
}
