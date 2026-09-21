package com.itheima.minterface;

public class InterfaceDemo1 {
    /*
        1. 接口介绍
            体现的思想是对规则的声明

        2. 接口定义和使用
            接口用关键字 interface 来定义
            接口和类之间是实现关系, 通过 implements 关键字表示
     */
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.method();
        ii.show();
    }
}

interface Inter {
    public abstract void show();
    public abstract void method();
}

class InterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("实现类重写后的show方法...");
    }

    @Override
    public void method() {
        System.out.println("实现类重写后的method方法...");
    }
}
