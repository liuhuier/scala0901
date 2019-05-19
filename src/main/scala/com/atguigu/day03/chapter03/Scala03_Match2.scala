package com.atguigu.day03.chapter03

object Scala03_Match2 {
    def main(args: Array[String]): Unit = {
        // 匹配数组
        for (array <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
            val res = array match {
                case Array(0) => "0"
                case Array(_, 0) => "1, 0"
                case Array(0, _, _) => "0, 1, 0"
                case Array(1, _, _) => "1, 1, 0"
                case Array(_, _, _, _) => "1, 1, 0, 1"
            }
            println(res)
        }

        // 匹配元组


        // 匹配列表
    }
}
