package com.atguigu.day02.chapter03

object Scala03_Trait4 {
    def main(args: Array[String]): Unit = {
        //val mysql = new MySql1 with DB1 with Data1
        val mysql = new MySql1 with Data1 with DB1
        mysql.insert(1)
    }
}

trait Operator1 {
    def insert(id: Int)
}

trait Data1 extends Operator1 {
    override def insert(id: Int): Unit = {
        println("Data1" + id)
    }
}

trait DB1 extends Operator1 {
    abstract override def insert(id: Int): Unit = {
        println("DB1" + id)
        super.insert(id)
    }
}

class MySql1 {

}
