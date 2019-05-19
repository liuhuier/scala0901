package com.atguigu.day02.chapter03;

public class TestPerson {
    public void method() {
        System.out.println("父类的方法");
    }
}

class Student extends TestPerson {
    public static void main(String[] args) {
        new Student().test();
    }

    public void test() {
        super.method();
    }

    @Override
    public void method() {
        System.out.println("子类的方法");
    }
}
