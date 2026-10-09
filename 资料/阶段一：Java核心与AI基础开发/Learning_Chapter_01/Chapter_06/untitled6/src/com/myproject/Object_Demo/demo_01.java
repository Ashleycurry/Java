package com.myproject.Object_Demo;

public class demo_01 {
    public static void main(String[] args) {
        // 案例：Object 类中的 toString 方法
        // Object 是所有类的祖宗类，所有类都默认继承了 Object 中的 toString() 方法

        System.out.println("=== 案例1：默认的 toString（子类没有重写）===");
        Car car = new Car("奔驰", 66.6);

        // 1. 直接打印对象：println 的底层会自动调用对象的 toString() 方法
        System.out.println(car);

        // 2. 手动调用 toString()，输出结果与上面完全一样
        System.out.println(car.toString());

        // 默认输出格式：全类名@哈希码的十六进制（类似"地址值"，没有实际意义）

        System.out.println();

        System.out.println("=== 案例2：重写 toString 之后 ===");
        Student s = new Student("张三", 20);

        // 重写后打印对象，输出的是属性的内容，更直观
        System.out.println(s);

        // 手动调用效果一样
        String str = s.toString();
        System.out.println(str);
    }
}

// 汽车类：没有重写 toString（使用 Object 中的默认版本）
class Car {
    String brand;   // 品牌
    double price;   // 价格

    public Car() {
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}

// 学生类：重写了 toString
class Student {
    String name;    // 姓名
    int age;        // 年龄

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写 toString()：返回对象属性拼接成的字符串
    // （IDEA 中可以用 Alt + Insert → toString() 自动生成）
    @Override
    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
