package com.learning.day02

object ForDemo {
    def main(args: Array[String]): Unit = {

        for (i <- 1 until 5 if i % 2 == 0) {
            println(i)
        }

    }
}
