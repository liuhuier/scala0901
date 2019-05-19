package com.atguigu.day03.chapter02

import scala.collection.mutable


/**
  * 队列 Queue
  */
object Scala03_Queue {
    def main(args: Array[String]): Unit = {
        val queue = mutable.Queue[Int](1, 2, 3)

        // println(queue)

        // 队列元素的增加
        queue += 4
        // println(queue)

        // 队列中追加List
        // queue ++= List(5, 6, 7)
        // queue += List(5, 6, 7)
        // println(queue)

        // 按照队列的进入顺序删除元素
        queue.dequeue()
        // println(queue)

        // 塞入数据
        queue.enqueue(5, 6)
        // println(queue)

        // 返回队列的第一个元素
        queue.head

        // 返回队列的最后一个元素
        queue.last

        // 返回队列的尾部元素
        queue.tail.tail
        println(queue)
    }
}
