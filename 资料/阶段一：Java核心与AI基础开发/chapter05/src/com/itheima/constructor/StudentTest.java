package com.itheima.constructor;

public class StudentTest {
    /*
        构造方法(构造器): 创建对象的时候, 要执行的方法.
            - 执行时机: 创建对象的时候被调用执行, 每创建一次对象, 都要执行.

        格式:
            1. 方法名与类名相同, 大小写也要一致
            2. 没有返回值类型, 连void都没有
            3. 不能使用return返回结果数据

        构造方法的作用:
            1. 本质的作用: 创建对象
            2. 结合执行时机: 在创建对象的时候, 给成员变量赋值
     */
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 23);
        System.out.println(stu1.name + "---" + stu1.age);

        Student stu2 = new Student("李四", 24);
        System.out.println(stu2.name + "---" + stu2.age);
    }
}
