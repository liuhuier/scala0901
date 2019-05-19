package com.atguigu.day01.chapter02

object Scala01_Obj {

    def apply() = {
        new Scala01_Obj
    }

    def main(args: Array[String]): Unit = {
        val obj: Scala01_Obj = Scala01_Obj()
        println(obj.name)
    }
}
class Scala01_Obj {
    private val name: String = "zhangsan"
}
