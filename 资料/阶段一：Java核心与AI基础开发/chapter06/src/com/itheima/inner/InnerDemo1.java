package com.itheima.inner;

public class InnerDemo1 {
    /*
        内部类创建对象的格式:

            外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();

        访问特点:
            内部类访问外部类: 直接访问.
            外部类访问内部类: 需要创建对象访问
     */
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.a);
        oi.show();
    }
}

class Outer {

    private int num = 10;

    public void method() {
        System.out.println("method...");
    }

    public void function() {
        Inner i = new Inner();
        System.out.println(i.a);
        i.show();
    }

    class Inner {
        int a = 10;

        public void show() {
            System.out.println("Inner...show...");
        }

        public void print() {
            System.out.println(num);
            method();
        }
    }

}