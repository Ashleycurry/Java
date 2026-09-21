package com.itheima.inner;

public class InnerDemo2 {
    /*
        静态内部类创建对象格式:

            格式: 外部类名.内部类名 对象名 = new 外部类名.内部类对象();
     */
    public static void main(String[] args) {
        MyOuter.Inner mi = new MyOuter.Inner();
        mi.show();

        MyOuter.Inner.method();
    }
}

class MyOuter {

    static class Inner {
        public void show() {
            System.out.println("Inner show");
        }

        public static void method() {
            System.out.println("Inner method");
        }
    }

}