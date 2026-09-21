package com.itheima.object;

import com.itheima.pojo.Student;

import java.util.Random;

public class ObjectMethodDemo {
    /*
        == 号
            1. 基本数据类型: 比较数据值
            2. 引用数据类型: 比较地址值

        Object类中equals方法默认也是比较地址值
            public boolean equals(Object obj) {
                return (this == obj);
            }
        结论: 推荐重写equals方法, 自己定制比较规则.
     */
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("张三", 23);

        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.equals(new Random()));
    }
}
