package com.itheima.polymorphism;

public class PolymorphismDemo1 {
    /*
        多态的前提:
            1. 继承 | 实现关系
            2. 方法重写
            3. 父类引用指向子类对象

        多态的成员访问特点:
            成员变量: 编译看左边(父类), 运行看左边(父类)
                            因为是父类的引用, 所以访问存在局限性, 只能访问super空间中的数据.

            成员方法: 编译看左边(父类), 运行看右边(子类)
                            编译时检查方法在父类中是否存在
                                不存在: 编译出错
                                存在: 编译通过, 但运行的时候, 一定会执行子类的方法逻辑

            静态成员: 编译看左边(父类), 运行看左边(父类)
                             static修饰的成员, 推荐使用类名调用
                             f.show();  ---> 字节码文件中 ---> Fu.show();
     */
    public static void main(String[] args) {
        // 子类引用, 指向子类对象
        Zi z = new Zi();
        System.out.println(z.num);          // 20
        z.show();                           // Zi....show...

        // 父类引用, 指向子类对象 (以多态的形式创建对象)
        Fu f = new Zi();
        System.out.println(f.num);          // 10
        f.show();                           // Zi....show...
    }
}

class Fu {
    int num = 10;

    public static void show() {
        System.out.println("Fu...show...");
    }
}

class Zi extends Fu {
    int num = 20;

    public static void show() {
        System.out.println("Zi....show...");
    }
}