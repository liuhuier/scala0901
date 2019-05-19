package com.atguigu.day03.chapter03

object ImplicitDemo {
    implicit class Double2Int(d: Double) {
        def me() = {
            d.toInt
        }
    }

    def main(args: Array[String]): Unit = {
        val a: Int = 2.5.me

        //        implicit def double2Int(d: Double): Int = {
        //            d.toInt
        //        }
    }



}
