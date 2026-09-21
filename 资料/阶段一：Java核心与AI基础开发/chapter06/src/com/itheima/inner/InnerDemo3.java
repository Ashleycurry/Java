package com.itheima.inner;

public class InnerDemo3 {
    /*
        局部内部类: 定义在方法中的类, 鸡肋语法, 了解即可.
     */
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}

class A {

    public void show() {

        class B {
            public void print() {
                System.out.println("print...");
            }
        }

        B b = new B();
        b.print();

    }
}
