package com.atguigu.day01.chapter01

/**
  * 伴生对象
  */
object VarTest2 {
    def main(args: Array[String]): Unit = {
        val test = new VarTest2("ww", 30, 1)
        test.name = "lisi"
        println(test.ageC + test.nameC)
        // println(test.name + " " + test.age)
    }
}

/**
  * 伴生类
  * 构造器
  */
class VarTest2 private (var nameC: String, val ageC: Int, grade: Int) {
    // var,默认属性私有,提供get set 方法
    var name = "zhangsan"
    // val,默认属性私有,提供get方法

    println(grade)
    val age = 10
    // 辅助构造器
    def this() {
        this("zl", 40, 3)
    }
}

/**
  * 测试类
  */
object Test {
    def main(args: Array[String]): Unit = {
        val test = new VarTest2()
        println(test.name + " " + test.age + test.nameC + test.ageC)
    }
}