package com.myproject.OOP_Demo_04;

public class demo_05 {
    public static void main(String[] args) {
        // 案例：抽象——抽象类和抽象方法
        // 抽象方法：用 abstract 修饰，只有方法声明、没有方法体，强制子类去实现
        // 抽象类：用 abstract 修饰的类

        System.out.println("=== 案例1：抽象类不能创建对象 ===");
        // Animal a = new Animal(); // 编译报错：抽象类不能实例化（不能 new）

        System.out.println();

        System.out.println("=== 案例2：子类重写所有抽象方法后才能使用 ===");
        Cat cat = new Cat();   // 先执行父类构造，再执行子类构造
        cat.name = "小白";
        cat.eat();             // 调用子类重写后的 eat()
        cat.drink();           // 普通方法从父类直接继承使用

        System.out.println();

        Dog dog = new Dog();
        dog.name = "旺财";
        dog.eat();
        dog.drink();
    }
}

// 抽象类：动物（有抽象方法 eat()，所以类必须也是抽象的）
abstract class Animal {
    String name; // 名字

    // 抽象类中可以有构造方法，供子类创建对象时初始化父类成员
    public Animal() {
        System.out.println("父类 Animal 的构造方法执行了");
    }

    // 抽象方法：只有方法声明，没有方法体，交给子类去实现
    // （每种动物"吃"的东西不一样，父类无法统一实现，就定义为抽象的）
    public abstract void eat();

    // 抽象类中也可以有普通方法
    public void drink() {
        System.out.println(name + "在喝水...");
    }
}

// 子类：猫（必须重写父类中所有的抽象方法）
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println(name + "在吃小鱼干...");
    }
}

// 子类：狗
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(name + "在啃骨头...");
    }

    // 如果不重写 eat()，那么 Dog 类也必须声明成 abstract，否则编译报错
}

/*
 * 抽象类的核心要点：
 * 1. 抽象方法没有方法体，必须定义在抽象类中（有抽象方法的类一定是抽象类）
 * 2. 抽象类不一定有抽象方法（全是普通方法也行，但通常没必要）
 * 3. 抽象类不能创建对象，只能被子类继承
 * 4. 抽象类中可以有构造方法、成员变量、普通方法
 * 5. 子类要么重写所有的抽象方法，要么自己也是抽象类
 * 6. 作用：父类定标准，子类做实现——强制子类完成某些行为
 */
