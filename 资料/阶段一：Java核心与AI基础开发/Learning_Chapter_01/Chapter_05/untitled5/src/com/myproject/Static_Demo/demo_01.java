package com.myproject.Static_Demo;

public class demo_01 {
    public static void main(String[] args) {
        // 案例：static 关键字——静态变量（所有对象共享）与静态方法（类名直接调用）
        System.out.println("=== 案例：static 关键字 ===");

        // 1. 静态变量属于类，用 类名. 访问；所有对象共享同一份
        Student.teacherName = "李老师";

        Student s1 = new Student("小明");
        Student s2 = new Student("小红");
        System.out.println(s1.name + " 的老师：" + s1.teacherName);
        System.out.println(s2.name + " 的老师：" + s2.teacherName);

        // 修改静态变量：所有对象看到的都跟着变
        Student.teacherName = "王老师";
        System.out.println("换老师后，两位学生的老师都变成了：" + s1.teacherName);

        System.out.println();

        // 2. 静态方法属于类，不用创建对象，类名.方法名() 直接调用
        Student.showSchool();
    }
}

// 学生类
class Student {
    String name;                // 实例变量：每个对象各自一份
    static String teacherName;  // 静态变量：所有对象共享一份

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    // 静态方法：属于类，用 类名.方法名() 调用
    // 注意：静态方法中不能使用 this，也不能直接访问非静态成员（此时还没有对象）
    public static void showSchool() {
        System.out.println("静态方法 showSchool()：不用创建对象就能直接调用");
    }
}
