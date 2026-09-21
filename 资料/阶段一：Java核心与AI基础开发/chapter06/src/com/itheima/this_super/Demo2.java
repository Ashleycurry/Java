package com.itheima.this_super;

public class Demo2 {
    /*
        项目升级到2.0版本, 需要新增一个成员变量
     */
    public static void main(String[] args) {
        A a1 = new A(10, 20);
        A a2 = new A(10, 20);

        A a3 = new A(10,20,30);
    }
}

class A {
    int a;
    int b;
    int c;

    public A() {
    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public A(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }
}
