package com.myproject.This_Demo_01;

public class this_demo_01 {
    public static void main(String[] args) {
        // 案例：this 关键字——区分成员变量和局部变量
        System.out.println("=== 案例：this 关键字 ===");

        Student s = new Student();
        s.setInfo("小明", 18);
        s.sayHello();
    }
}

// 学生类
class Student {
    // 成员变量
    String name;
    int age;

    // 方法的形参 name、age 是局部变量，和成员变量重名
    // this 表示"当前对象"：谁调用方法，this 就是谁
    public void setInfo(String name, int age) {
        this.name = name;   // this.name 是成员变量，右边的 name 是形参
        this.age = age;     // 不写 this 则两边都指形参，成员变量永远赋不上值
    }

    public void sayHello() {
        // 这里没有重名冲突，直接写 name、age 默认就是成员变量，不需要 this
        System.out.println("大家好，我是 " + name + "，今年 " + age + " 岁");
    }
}
