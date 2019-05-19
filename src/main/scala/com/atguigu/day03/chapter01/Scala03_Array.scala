package com.atguigu.day03.chapter01

import scala.collection.mutable.ArrayBuffer

object Scala03_Array {
    def main(args: Array[String]): Unit = {

        /**
          * String可以循环,因为String底层是char数组
          */
        for (i <- "hello scala") {
            // println(i)
        }

        /**
          * 创建数组的两种方式
          * []: 表示泛型
          * 定长数组
          */
        val array1 = new Array[Int](3)
        array1(0) = 4
        array1(1) = 5
        array1(2) = 6
        // array1(3) = 7 数组越界异常
        // println(array1(2))

        val array2 = Array(1, 2, 3)
        // println(array2(0))

        // 数组中可以存放不同类型的元素
        val array3: Array[Any] = Array(1, 2, "scala", true, 3.5)
        for (i <- array3) {
            // println(i)
        }

        /**
          * 变长数组
          */
        val buffer1 = new ArrayBuffer[Int]()
        buffer1.append(1, 2, 3)

        // 重新赋值
        buffer1(0) = 7

        // println(buffer1)

        /**
          * 定长数组和变长数组的转换
          */
        val array2Buffer = array1.toBuffer
        val buffer2Array = buffer1.toArray
        // println(buffer2Array(0))
        // println(array2Buffer(0))
        array2Buffer.append(7, 8, 9)
        // println(array2Buffer(5))

        /**
          * 数组遍历
          */
        for (i <- array2Buffer) {
            // println(i)
        }

        /**
          * 多维数组: 数组里面嵌套数组
          */
        val array4 = Array.ofDim[Int](3, 4)
        // [ [4个元素], [4个元素], [4个元素] ]
        println(array4(0)(0)) // 0
    }
}
