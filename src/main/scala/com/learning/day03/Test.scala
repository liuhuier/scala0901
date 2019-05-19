package com.learning.day03


/**
  * 测试apply方法
  */
object Test2 {
    def main(args: Array[String]): Unit = {
        val person = Person1()
        println(person)
    }
}

object Person1 extends App {
    def apply(): Person1 = {
        new Person1()
    }
}

class Person1 {

}