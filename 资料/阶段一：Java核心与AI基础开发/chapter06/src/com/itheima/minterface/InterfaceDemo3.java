package com.itheima.minterface;

public class InterfaceDemo3 {
    /*
        接口和类的关系: 实现关系, 可以单实现, 也可以多实现, 甚至可以在继承一个类的同时, 实现多个接口.
        接口和接口的关系: 继承关系, 可以单继承, 也可以多继承
     */
    public static void main(String[] args) {

    }
}

interface A {
    void method();
}

interface B {
    void method();
}

interface C extends A, B {
    void method();
}

class CImpl implements C {

    @Override
    public void method() {

    }
}

class Fu {
    public void show() {
        System.out.println("Fu..show");
    }
}

interface InterA {
    void show();
}

interface InterB {
    void show();
}

class InterABImpl extends Fu implements InterA, InterB {
    public void show() {
        System.out.println("Fu..show");
    }
}