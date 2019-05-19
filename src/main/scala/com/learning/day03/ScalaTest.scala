package com.learning.day03

/**
  * Java中的内部类从属于外部类
  * Scala中内部类从属于实例
  */
class ScalaTest {
    // 成员内部类
    class ScalaInner {
        // 在方法声明上，如果使用  外部类#内部类  的方式，表示忽略内部类的对象关系，等同于Java中内部类的语法操作
        def func(scalaInner: ScalaTest#ScalaInner) = {
            println(scalaInner)
        }
    }

}

object ScalaTest {
    // 静态内部类
    class ScalaStaticInner {
        def func(): Unit = {
            println("ScalaStaticInner")
        }
    }

}

object Test1 {
    def main(args: Array[String]): Unit = {
        // 创建成员内部类对象
        val scalaTest1: ScalaTest = new ScalaTest
        val scalaTest2: ScalaTest = new ScalaTest
        val scalaInner1: scalaTest1.ScalaInner = new scalaTest1.ScalaInner
        val scalaInner2: scalaTest2.ScalaInner = new scalaTest2.ScalaInner

        // Scala中内部类从属于外部类的对象，所以外部类的对象不一样，创建出来的内部类也不一样，无法互换使用
        // com.learning.day03.ScalaTest$ScalaInner@ea4a92b
        scalaInner1.func(scalaInner1)

        // 在方法声明上，如果使用  外部类#内部类  的方式，表示忽略内部类的对象关系，等同于Java中内部类的语法操作
        // com.learning.day03.ScalaTest$ScalaInner@3c5a99da
        scalaInner1.func(scalaInner2)

        // 创建静态内部类对象
        val scalaStaticInner: ScalaTest.ScalaStaticInner = new ScalaTest.ScalaStaticInner

    }
}