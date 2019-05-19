package com.atguigu.day01.chapter01

class Scala_Test (val name: String, private var age: Int, sex: String) {
//    def this(name: String, age: Int) = {
//        this("李四", 18, "女")
//    }
}

object Scala {
    def main(args: Array[String]): Unit = {
        val zs = new Scala_Test("zs", 10, "male")
        //        println(zs.name + " " + zs.age)
        //    zs.name = "ls"

//        println(zs.age)

        f1

    }

    def f1() =  {
        "hello"
    }
}
