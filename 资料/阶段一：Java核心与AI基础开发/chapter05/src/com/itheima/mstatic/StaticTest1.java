package com.itheima.mstatic;

public class StaticTest1 {
    /*
        static 是静态的意思，可以修饰成员变量，也可以修饰成员方法

        1. 被其修饰的成员, 被该类的所有对象所共享
        2. 多了一种调用方式, 可以通过类名调用
        3. 随着类的加载而加载, 优先于对象存在
     */
    public static void main(String[] args) {

        Student.school = "传智大学";

        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 23;

        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.age = 24;

        Student stu3 = new Student();


        System.out.println(stu1.name + "---" + stu1.age + "---" + Student.school);
        System.out.println(stu2.name + "---" + stu2.age + "---" + Student.school);
        System.out.println(stu3.name + "---" + stu3.age + "---" + Student.school);
    }
}
