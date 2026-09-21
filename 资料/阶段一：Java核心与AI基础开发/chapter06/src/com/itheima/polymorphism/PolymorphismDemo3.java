package com.itheima.polymorphism;

public class PolymorphismDemo3 {
    /*
        多态的好处: 提高代码的扩展性
                        - 方法的形参定义为父类类型, 就可以传入该类的任意, 子类对象了.
        多态的弊端: 不能直接调用子类特有的成员
                        - 需要向下转型.

        ClassCastException : 类型转换异常
                原因: 在强转的过程中, 如果目标类型和实际类型, 不是同一种类型, 就会出现该异常.

                instanceof : 判断左边的变量, 记录的是否是右边的类型, 返回true, false结果.
     */
    public static void main(String[] args) {
        useAnimal(new Dog());
        useAnimal(new Cat());
    }

    public static void useAnimal(Animal a) {
        // 第一次调用方法:  Animal a = new Dog();
        // 第二次调用方法:  Animal a = new Cat();
        a.eat();
        if (a instanceof Dog){
            Dog d = (Dog) a;
            d.watchHome();
        }else if (a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }

    }

}


abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome() {
        System.out.println("狗看家...");
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫捉老鼠...");
    }
}
