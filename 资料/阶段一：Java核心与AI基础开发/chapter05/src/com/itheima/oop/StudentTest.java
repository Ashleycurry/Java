package com.itheima.oop;

public class StudentTest {
    /*
        测试类: 带有main方法的类

        细节补充:
            1. 成员变量就算没有赋值, 也可以使用, 使用的是默认值
            2. 打印对象名, 看到的是内存地址

                    com.itheima.oop.Student@b4c966a
                    com.itheima.oop.Student 全类名
     */
    public static void main(String[] args) {
        // 创建对象: 类名 对象名 = new 类名();
        Student stu1 = new Student();
        System.out.println(stu1);
        stu1.name = "张三";
        stu1.age = 23;
        // 使用对象: 对象名.变量名;  对象名.方法名();
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        stu1.study();
        stu1.eat();

        Student stu2 = new Student();
        System.out.println(stu2);
        stu2.name = "李四";
        stu2.age = 24;
        System.out.println(stu2.name);
        System.out.println(stu2.age);
        stu2.study();
        stu2.eat();
    }
}
