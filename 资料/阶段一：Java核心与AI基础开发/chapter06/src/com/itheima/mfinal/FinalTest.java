package com.itheima.mfinal;

public class FinalTest {
    /*
       final关键字: 可以修饰方法, 类, 变量.

       方法: 被其修饰的方法, 不能被重写
       类: 被其修饰的类, 不能被继承
       变量: 被其修饰的变量就变成了常量, 不能修改.

                基本数据类型变量: 数据值不可改变
                引用数据类型变量: 地址值不可改变

                final修饰成员变量, 初始化时机
                        1. 在定义的时候完成赋值
                        2. 在构造方法结束之前完成赋值.

       ----------------------------------------------------------------
       final修饰的变量就变成了常量, 常量的命名规范
       1. 如果是一个单词: 所有字母大写       MAX
       2. 如果是多个单词: 所有字母大写, 中间使用_分割  MAX_VALUE
     */
    public static void main(String[] args) {
        final int[] arr = {11, 22, 33};
        // arr = new int[2];
    }
}

class A {
    final int num;

    public A(int num) {
        this.num = num;
    }
}

final class Fu extends Object {
    public void method() {
        System.out.println("Fu类中非常重要的方法, 不希望子类修改.");
    }

    public void method1() {
        System.out.println("Fu类中非常重要的方法, 不希望子类修改.");
    }

    public void method2() {
        System.out.println("Fu类中非常重要的方法, 不希望子类修改.");
    }

    public void method3() {
        System.out.println("Fu类中非常重要的方法, 不希望子类修改.");
    }
}
