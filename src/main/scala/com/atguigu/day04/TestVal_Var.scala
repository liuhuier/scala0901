package com.atguigu.day04

object TestVal_Var {
    def main(args: Array[String]): Unit = {
        val p = new Person()
        println(p.grade)

    }
}

// 主构造方法
class Person(private val name: String = "zs", var age: Int = 10, sex: String) {
    val grade = "一年级"

    // private val person = new Person()

    def this() {
        this("ww", 88, "female")
    }

    //    println(name)
    //    age = 11
    //    println(age)
    //    println(sex + "女生")

}

object Person {
    private val person: Person =new Person()
    def main(args: Array[String]): Unit = {

        println(person.name)
    }

}
