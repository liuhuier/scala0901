package com.atguigu.day02.chapter04

object Scala04_Implicit {
    def main(args: Array[String]): Unit = {
        // 隐式函数: 只有一个参数的函数
        implicit def mySql2RichMySql(mysql: MySql): RichMySql = {
            new RichMySql
        }

        val mysql = new MySql
        // 隐式方法
        mysql.delete(2)
    }
}

class MySql {
    def insert(id: Int) = {
        println("insert" + id)
    }
}

class RichMySql {
    def delete(id: Int) = {
        println("delete" + id)
    }
}