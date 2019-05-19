package com.atguigu.day03.chapter01

object Scala03_Implicit {

    // 隐式类
    implicit class Int2RichInt(i: Int) {
        def test() = {
            println("test")
        }
    }

    def main(args: Array[String]): Unit = {
        1.test() // test
    }
}


