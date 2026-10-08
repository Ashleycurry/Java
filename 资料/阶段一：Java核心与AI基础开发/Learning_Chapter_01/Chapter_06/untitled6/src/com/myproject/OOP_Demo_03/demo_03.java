package com.myproject.OOP_Demo_03;

public class demo_03 {
    public static void main(String[] args) {
        // 案例：继承——子类自动拥有父类的属性和方法
        System.out.println("=== 案例1：继承的基本使用 ===");

        // 1. 创建子类对象
        Cat cat = new Cat();
        cat.name = "小白";       // name 属性继承自父类 Animal
        cat.eat();               // eat() 方法继承自父类
        cat.sleep();             // sleep() 方法继承自父类
        cat.catchMouse();        // catchMouse() 是子类自己特有的方法

        System.out.println();

        Dog dog = new Dog();
        dog.name = "旺财";
        dog.eat();
        dog.sleep();
        dog.lookHome();          // lookHome() 是子类自己特有的方法

        System.out.println();

        // 案例2：方法重写（子类重新实现父类的方法）
        System.out.println("=== 案例2：方法重写 ===");
        cat.eat();               // 调用的是 Cat 中重写后的 eat()
        dog.eat();               // 调用的是 Dog 中重写后的 eat()

        System.out.println();

        // 案例3：构造方法的调用顺序（先父类后子类）
        System.out.println("=== 案例3：构造方法调用顺序 ===");
        Pig pig = new Pig();
        pig.eat();
    }
}

// 父类：动物类
class Animal {
    String name;    // 名字

    // 父类构造方法
    public Animal() {
        System.out.println("Animal 父类的无参构造方法执行了");
    }

    public void eat() {
        System.out.println(name + "在吃东西...");
    }

    public void sleep() {
        System.out.println(name + "在睡觉...");
    }
}

// 子类：猫类，继承 Animal 父类
class Cat extends Animal {

    // 方法重写：子类重写父类的 eat() 方法
    @Override
    public void eat() {
        System.out.println(name + "在吃小鱼干...");
    }

    // 子类特有的方法
    public void catchMouse() {
        System.out.println(name + "在抓老鼠...");
    }
}

// 子类：狗类，继承 Animal 父类
class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println(name + "在啃骨头...");
    }

    // 子类特有的方法
    public void lookHome() {
        System.out.println(name + "在看家护院...");
    }
}

// 子类：猪类，演示构造方法的调用顺序
class Pig extends Animal {

    // 子类构造方法的第一行默认会调用 super()（父类无参构造）
    public Pig() {
        // 这里隐藏了一行代码：super();
        System.out.println("Pig 子类的无参构造方法执行了");
    }
}
