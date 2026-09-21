package com.itheima.test;

import com.itheima.pojo.Student;

public class StudentTest {
    public static void main(String[] args) {
        // 1. 使用无参数构造方法创建对象, 通过setXxx方法赋值
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        System.out.println(stu1.getName() + "---" + stu1.getAge());
        // 2. 使用带参数构造方法创建对象, 在创建对象的过程中直接赋值
        Student stu2 = new Student("李四", 24);
        System.out.println(stu2.getName() + "---" + stu2.getAge());

        // 思路: getXxx方法是能够拿到真实的数据, 数据到手干什么都行.
        for (int i = 1; i <= stu2.getAge(); i++) {
            System.out.println("HelloWorld");
        }
    }
}
