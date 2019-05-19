package com.atguigu.day02.chapter04

object Scala04_Implicit2 {

    // 隐式类
    implicit class MySql2RichMySql(mysql: MySql2) {
        def delete2(id: Int) = {
            println("delete")
        }
    }

    def main(args: Array[String]): Unit = {
        val mysql = new MySql2
        // 本类的方法
        mysql.insert(2)
        // 隐式类的方法
        mysql.delete2(2)
    }
}

class MySql2 {
    def insert(id: Int) = {
        println("insert")
    }
}

