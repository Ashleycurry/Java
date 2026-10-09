package com.myproject.Final_Demo;

public class demo_01 {
    public static void main(String[] args) {
        // 案例：final 关键字——"最终的"，表示不可改变
        // final 可以修饰：变量、方法、类

        System.out.println("=== 案例1：final 修饰变量（变成常量）===");

        // 1. final 修饰基本类型变量：值只能赋值一次，之后不能再修改
        //    常量命名规范：单词全部大写，多个单词用下划线连接（如 MAX_VALUE）
        final int MAX = 100;
        System.out.println("常量 MAX = " + MAX);
        // MAX = 200; // 编译报错：final 修饰的变量只能赋值一次

        // 2. final 修饰引用类型变量：地址值不能改变，但对象内部的内容可以修改
        final Student stu = new Student("张三", 20);
        System.out.println("修改前：" + stu);

        stu.name = "李四"; // 可以：修改的是对象内部的属性（内容）
        stu.age = 21;
        System.out.println("修改后：" + stu);

        // stu = new Student("王五", 22); // 编译报错：不能再指向新对象（地址不能变）

        System.out.println();

        System.out.println("=== 案例2：final 修饰方法（不能被重写）===");
        Zi zi = new Zi();
        zi.show();     // 父类中 final 修饰的方法，子类继承下来可以照常使用
        zi.methodZi(); // 子类自己的方法
        // 子类中重写 show() 会编译报错，详见 Zi 类中的注释

        System.out.println();

        System.out.println("=== 案例3：final 修饰类（不能被继承）===");
        A a = new A();
        a.aa();
        // 类 B 继承 A 会编译报错，详见文件末尾注释
    }
}

// 学生类（用于演示 final 修饰引用类型变量）
class Student {
    String name; // 姓名
    int age;     // 年龄

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写 toString 方便打印对象内容
    @Override
    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}

// 父类
class Fu {
    // final 修饰的方法：子类可以继承使用，但不能重写
    public final void show() {
        System.out.println("父类 Fu 中 final 修饰的 show 方法");
    }
}

// 子类
class Zi extends Fu {
    // 注意：下面这样重写会编译报错——final 方法不能被重写
    // @Override
    // public void show() {
    //     System.out.println("子类试图重写 show 方法");
    // }

    public void methodZi() {
        System.out.println("子类 Zi 自己的 methodZi 方法");
    }
}

// final 修饰的类：不能被继承（Java 中的 String、Math 类都是 final 类）
final class A {
    public void aa() {
        System.out.println("final 类 A 中的 aa 方法");
    }
}

// 注意：下面这样继承会编译报错——final 类不能被继承
// class B extends A {
// }
