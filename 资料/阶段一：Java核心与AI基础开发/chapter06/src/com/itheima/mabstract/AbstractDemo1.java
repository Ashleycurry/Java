package com.itheima.mabstract;

public class AbstractDemo1 {
    /*
        抽象类介绍: 一种特殊的父类, 内部可以编写抽象方法

        抽象方法: 共性的行为（方法）抽取到父类之后，发现该方法的实现逻辑
	                无法在父类中给出具体明确，该方法就可以定义为抽象方法

	                特点: 强制要求子类重写的方法
     */
    public static void main(String[] args) {

    }
}

abstract class Animal {
    public abstract void eat();

    public void drink(){
        System.out.println("喝水");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃肉");
    }
}