package com.learning.day02

object VarDemo1 {
    def main(args: Array[String]): Unit = {
        val t1 = new Test
        // println(t1.name)

    }
}

/**
  * Test类默认是public的
  * scala类只有两种权限修饰符：public和private
  */
class Test {
    val name = "zhangsan"

    // private关键字,set get方法是私有的
    private var age = 10



}
