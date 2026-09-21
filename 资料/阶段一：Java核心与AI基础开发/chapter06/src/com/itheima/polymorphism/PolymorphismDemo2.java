package com.itheima.polymorphism;

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        // 接口类型变量, 指向了实现类对象 (多态的形式创建对象)
        Inter i = new InterImpl();
        i.show();
    }
}

interface Inter {
    void show();
}

class InterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("实现类重写后的show方法...");
    }
}