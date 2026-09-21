package com.itheima.test;

import com.itheima.pojo.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {
    /*
        需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
                  学生的姓名和年龄来自于键盘录入
     */
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("第" + i + "个: ");
            addStudent(list);
        }

        // 遍历集合, 取出学生对象, 并打印学生信息
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu);
        }

    }

    private static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名: ");
        String name = sc.next();
        System.out.println("请输入年龄: ");
        int age = sc.nextInt();

        // 将学生的姓名和年龄, 封装为学生对象
        Student stu = new Student(name, age);

        // 将学生对象, 存入集合
        list.add(stu);
    }
}
