package com.learning.day03;

public class JavaTest {
    // 成员内部类
    public class JavaInner {
        public void method1(JavaInner javaInner) {
            System.out.println(javaInner);
        }
    }

    // 静态内部类
    public static class JavaStaticInner {
        public void method2() {
            System.out.println("JavaStaticInner");
        }
    }
}

class Test {
    public static void main(String[] args) {
        JavaTest javaTest1 = new JavaTest();
        JavaTest javaTest2 = new JavaTest();
        // 创建java成员内部类对象
        JavaTest.JavaInner javaInner1 = javaTest1.new JavaInner();
        JavaTest.JavaInner javaInner2 = javaTest2.new JavaInner();


        // com.learning.day03.JavaTest$JavaInner@29453f44
        javaInner1.method1(javaInner2);
        // com.learning.day03.JavaTest$JavaInner@5cad8086
        javaInner2.method1(javaInner1);

        // 创建java静态内部类对象
        JavaTest.JavaStaticInner javaStaticInner = new JavaTest.JavaStaticInner();
        javaStaticInner.method2();
    }
}