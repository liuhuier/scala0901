package com.atguigu.day03.chapter01

import scala.collection.mutable.ArrayBuffer

/**
  * scala数组转java数组
  */
object Scala03_Scala2Java {
    def main(args: Array[String]): Unit = {

        val arr = ArrayBuffer("1", "2", "3")

        //Scala to Java
        import scala.collection.JavaConversions.bufferAsJavaList

        val javaArr: ProcessBuilder = new ProcessBuilder(arr)

        println(javaArr.command()) //[1, 2, 3]

        val java = new Scala03_Scala2Java
        // println(java.test)
    }
}

// 伴生类
class Scala03_Scala2Java {
    /**
      * java数组转scala数组
      */
    private val test = "test"
}