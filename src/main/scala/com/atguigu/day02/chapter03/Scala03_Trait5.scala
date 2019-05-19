package com.atguigu.day02.chapter03

object Scala03_Trait5 {
    def main(args: Array[String]): Unit = {
        val mysql = new MySql5 with Data5
        println(mysql.operatorType)
    }
}

trait Operator5 {
    val operatorType: String
}

trait Data5 extends Operator5 {
    override val operatorType: String = "operator"
}

class MySql5 {

}
