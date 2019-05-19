package com.atguigu.day03.chapter03


abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object Nothing extends Amount

object Scala03_CaseClass {
    def main(args: Array[String]): Unit = {
        /*for (amt <- Array(Dollar(1000.0), Currency(1000.0, "EUR"), Nothing)) {
            val result = amt match {
                case Dollar(v) => "$" + v
                case Currency(_, u) => u
                case Nothing => ""
            }
            println(amt + ": " + result)
        }*/

        val list: List[Int] = List(1, 2, 3, 4)

        def addOne(i: Int): Int = {
            // i + 1
            i match {
                case int: Int => int
            }
        }

        println(list.map(addOne)) // List(1, 2, 3, 4)
    }


}
