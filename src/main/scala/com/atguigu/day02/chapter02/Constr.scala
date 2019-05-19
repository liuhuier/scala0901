package com.atguigu.day02.chapter02

object Constr {
    def main(args: Array[String]): Unit = {
        // val mi: Phone = new Mi
        // println(mi.name)
        // println(mi.age)
        // println(mi.abs)

        val meizu = new Mi("meizu")
        println(meizu.newName)

    }
}

abstract class Phone(var name: String) {
    println("Phone start")
    //val age = 10
    val age: Int = 20

    // 抽象方法不需要abstract关键字
    def abs

    var newname: String // 抽象字段
    def printName: String // 抽象方法

}

class Mi(val newName: String) extends Phone(newName) {
    // newName = "lisi"
    //override val age = 8
    override val age = 20
    // 辅助构造器
    def this() {
        this("redmi")
    }

    def abs = {
        1
    }

    var newname = "zhangsan"
    val printName = newname
}
