package com.learning.day02

import com.atguigu.day01.Test

// 导入对象的所有方法
import com.atguigu.day01.Test._

object BreakDemo {
    def main(args: Array[String]): Unit = {

        test()

        println(a)

        // Test.test()

        var i = 1
        // 导入对象，然后就可以使用对象的函数
        import util.control.Breaks._
        breakable {
            while (i <= 20) {
                i += 1
                if (i == 10) {
                    break()
                }
            }
        }
        println(i)
    }
}

