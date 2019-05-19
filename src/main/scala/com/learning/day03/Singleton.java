package com.learning.day03;

public class Singleton {
    // 私有化构造器
    private Singleton() {
    }

    // 私有化静态内部类
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 创建对象
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
