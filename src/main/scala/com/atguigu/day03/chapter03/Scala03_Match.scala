package com.atguigu.day03.chapter03

/**
  * 模式匹配
  */
object Scala03_Match {
    def main(args: Array[String]): Unit = {
        // 匹配值
        var result = 0
        val c: Char = '%'
        c match {
            case '-' => result = -1
            case '+' => result = 1
            case '*' => result = 2
            case '/' => result = -2
            case _ => "default"
        }
        // println(result)
    }

    val s = "hello"
    // println(s(0))

    /*val str = "+-3!"
    for (i <- str.indices) {
        //有效索引集合
        var sign = 0
        var digit = 0

        str(i) match {
            case '+' => sign = 1
            case '-' => sign = -1
            case ch if Character.isDigit(ch) => digit = Character.digit(ch, 10)
            case _ =>
        }
        println(str(i) + " " + sign + " " + digit)*/

    // 模式匹配中的类型匹配不考虑泛型
    val a = 0
    val obj = if (a == 1) 1
    else if (a == 2) "2"
    else if (a == 3) BigInt(3)
    else if (a == 4) Map("aa" -> 1)
    else if (a == 5) Map(1 -> "aa")
    else if (a == 6) Array(1, 2, 3)
    else if (a == 7) Array("aa", 1)
    else if (a == 8) Array("aa")

    val res: String = obj match {
        case i: Int => "Int"
        case i: String => "String"
        case i: BigInt => "BigInt"
        case i: Map[String, Int] => "[String Int]"
        case i: Map[Int, String] => "[Int String]"
        case i: Array[String] => "Array[String]"
        case i: Array[Int] => "Array[Int]"
        case _ => "no"
    }
    println(res)

}

