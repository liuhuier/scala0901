package com.learning.day04

object Constructor {
    def main(args: Array[String]): Unit = {

    }
}

// 主构造器
class Animal(val name: String, var age: Int) {

}

// 只能是子类的主构造器调用父类的主构造器
class Cat extends Animal("zhangsan", 10) {

}