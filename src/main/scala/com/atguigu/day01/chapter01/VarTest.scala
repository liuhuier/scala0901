package com.atguigu.day01.chapter01

object VarTest {

    // 属性默认私有 get set方法
    private var name = "zs"
    // name的set方法
    name = "lisi"

    // private get方法
    val age = 10
    // age没有set方法
//    age = 20 // error

    // get set方法都是私有的
    private var name1 = "wangwu"

    def main(args: Array[String]): Unit = {

        // name的get方法
        println(name)

        // age的get方法
        println(age)

        var sex = "male"
        sex = "famale"

        val grade = "一年级"
//        grade = "二年级" // error

    }
}

object Test {
    def main(args: Array[String]): Unit = {

    }
}