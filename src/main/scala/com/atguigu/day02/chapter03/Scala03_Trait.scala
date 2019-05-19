package com.atguigu.day02.chapter03

trait Scala03_Trait {
    def log
}

class Console extends Scala03_Trait with Serializable {
    override def log: Unit = {
        println("logger...")
    }
}

object Test {
    def main(args: Array[String]): Unit = {
        val console = new Console
        console.log
    }
}
