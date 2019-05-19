package com.atguigu.day04

object ExtendTest {
    private val a: A = new B

    def main(args: Array[String]): Unit = {
        for (amt <- Array (Dollar (1000.0), Currency (1000.0, "EUR"), Nothing) ) {
            val result = amt match {
                // case相当于提取器,放进去什么,取出来就是什么,例如放进1000.0,那么取出来就是1000.0
                case Dollar (v) => "$" + v
                case Currency (_, u) => u
                case Nothing => ""
            }
            println (amt + ": " + result)
        }
    }
}

class A {
    val name = "A"

    def func() = {
        println("AA")
    }
}

class B extends A {
    override val name = "B"

    override def func() = {
        println("BB")
    }
}

abstract class Amount

// 样例类必须有参数,因为样例类是有应用和提取的,如果没有参数就无法提取
case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object Nothing extends Amount



