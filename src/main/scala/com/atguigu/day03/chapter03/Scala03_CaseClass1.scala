package com.atguigu.day03.chapter03

object Scala03_CaseClass1 {
    def main(args: Array[String]): Unit = {
        for (i <- Array(AAA("zs"), BBB("ls", 10), CCC)) {
            val str = i match {
                case AAA(s) => s
                case BBB(a, b) => a
                case CCC => "object"
            }
            println(str)
        }

//        val zhangsan = BBB("zhangsan", 10)
//
//        val unit = zhangsan match {
//            case AAA(s) => s
//            case BBB(n, 10) => n
//            case _ => ""
//        }
//        println(unit)

    }
}

case class AAA(name: String)

case class BBB(name: String, age: Int)

case object CCC

// class DDD

