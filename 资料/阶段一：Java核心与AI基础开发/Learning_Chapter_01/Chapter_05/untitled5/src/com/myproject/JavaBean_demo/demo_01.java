package com.myproject.JavaBean_demo;

public class demo_01 {
    public static void main(String[] args) {
        // 案例：标准 JavaBean
        // 规范：① 属性全部 private  ② 提供无参构造和有参构造  ③ 提供每个属性的 get/set 方法
        System.out.println("=== 案例：标准 JavaBean ===");

        // 1. 无参构造 + set 方法赋值
        Student s1 = new Student();
        s1.setName("小明");
        s1.setAge(18);
        System.out.println("s1：" + s1.getName() + "，" + s1.getAge() + " 岁");

        System.out.println();

        // 2. 有参构造创建对象，一步完成赋值
        Student s2 = new Student("小红", 20);
        System.out.println("s2：" + s2.getName() + "，" + s2.getAge() + " 岁");
    }
}

// 标准 JavaBean：Student
class Student {
    // ① 属性全部 private（封装）
    private String name;
    private int age;

    // ② 无参构造
    public Student() {
    }

    // ② 有参构造（this 把参数赋给成员变量）
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ③ 每个属性一对 get/set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
