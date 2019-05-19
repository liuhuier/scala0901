package com.atguigu.day02.chapter02

// 抽象类
abstract class NiMing {
    val name: String
}

object Test {
    def main(args: Array[String]): Unit = {
        val i = new NiMing {
            override val name: String = "zhangsan"
        }
        println(i.name)
    }
}
class Human {
    
}