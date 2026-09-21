package com.itheima.test;

import com.itheima.pojo.Student;

import java.util.ArrayList;

public class ArrayListTest2 {
    /*
        需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
     */
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 14);
        Student stu3 = new Student("王五", 15);

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            // 从集合中取出[每一个]学生对象
            Student stu = list.get(i);
            // 获取每一个学生对象的年龄, 进行判断.
            if (stu.getAge() < 18) {
                System.out.println(stu);
            }
        }
    }
}
