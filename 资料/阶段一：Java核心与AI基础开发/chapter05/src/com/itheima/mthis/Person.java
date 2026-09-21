package com.itheima.mthis;

public class Person {
    int num = 10;

    public void show() {
        int num = 20;
        System.out.println(num);
        System.out.println(this.num);
    }

    public void print() {
        System.out.println(this);
    }

    public void method() {
        System.out.println(num);
        print();
    }
}
