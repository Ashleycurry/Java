package com.itheima.minterface;

public class InterfaceDemo4 {
    /*
        接口新特性:
            JDK8版本开始 接口中可以定义有方法体的方法。（默认、静态）
            JDK9版本开始 接口中可以定义私有方法。
     */
    public static void main(String[] args) {

        TestABImpl t = new TestABImpl();
        t.method();
        t.show();

        OrderServiceImplA a = new OrderServiceImplA();
        a.create();
        a.cancel();
        a.paid();

        OrderServiceImplB b = new OrderServiceImplB();
        b.create();
        b.cancel();
        b.paid();

        OrderService.print();
    }
}

interface OrderService {
    void create();

    void cancel();

    default void paid() {
        System.out.println("支付功能...");
    }

    static void print(){
        System.out.println("OrderService...static...print...");
    }
}

class OrderServiceImplA implements OrderService {

    @Override
    public void create() {

    }

    @Override
    public void cancel() {

    }
}

class OrderServiceImplB implements OrderService {

    @Override
    public void create() {

    }

    @Override
    public void cancel() {

    }
}

interface TestA {
    default void show(){
        System.out.println("TestA...default...show...");
    }
}

interface TestB {
    default void method(){
        System.out.println("TestB...default...method...");
    }
}

class TestABImpl implements TestA, TestB {

}