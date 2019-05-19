package com.atguigu.day02.chapter03

object Scala03_Trait3 {
    def main(args: Array[String]): Unit = {

        // val mysql = new MySql
        // mysql.insert(1)

        /**
          * 动态混入特质
          */

        // val mysql = new MySql with File with DB
        // mysql.insert(1) // 向数据库向文件插入数据1

        // val mysql = new MySql with Data with DB
        // mysql.insert(1) // 向数据库向data插入数据1

        val mysql = new MySql with DB with Data
        mysql.insert(1) // 向数据库向data插入数据1
    }
}

trait Operate {
    def insert(id: Int)
}

trait Data extends Operate {
    override def insert(id: Int): Unit = {
        print("向data")
        println("插入数据" + id)
    }
}

trait DB extends Data {
    override def insert(id: Int): Unit = {
        print("向数据库")
        super.insert(id)
    }
}

trait File extends Data {
    override def insert(id: Int): Unit = {
        print("向文件")
        super.insert(id)
    }
}

class MySql /*extends DB with File*/ {

}
