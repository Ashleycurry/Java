package com.itheima.inner.anonymity;

public class AnonymityDemo {
    /*
        匿名内部类: 本质上来说是一种特殊的局部内部类.

        使用前提: 需要存在一个类, 或者是接口

                new 类名(){}  -->  继承这个类
                new 接口(){}  -->  实现这个接口

        匿名内部类的使用场景: 常用于方法的参数传递.
     */
    public static void main(String[] args) {
        // 匿名内部类对象
        new Fu(){
            @Override
            public void method() {
                System.out.println("匿名内部类, 重写后的method方法.");
            }
        }.method();

        // 1. 实现接口  2. 重写方法  3. 创建实现类对象
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类, 重写后的show方法.");
            }
        }.show();

        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("show...");
            }
        });
    }

    /*
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("show....");
            }
        };

        Inter i = Inter接口的实现类对象.
     */
    public static void useInter(Inter i){
        i.show();
    }
}

class Fu {
    public void method() {
        System.out.println("Fu...method...");
    }
}

interface Inter {
    void show();
}