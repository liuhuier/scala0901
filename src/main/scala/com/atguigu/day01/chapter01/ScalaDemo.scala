package com.atguigu.day01.chapter01

object ScalaDemo {
    var age: Int = 10
    val newage = 30

    def main(args: Array[String]): Unit = {
        // println(print("lisi"))
        // set方法
        age = 20
        // newage = 40
        // get方法
        println(age)
        println(newage)
    }

    def print(name: String) = {
        // name = "wangwu"
        println(name)
        "zs"
    }


}
