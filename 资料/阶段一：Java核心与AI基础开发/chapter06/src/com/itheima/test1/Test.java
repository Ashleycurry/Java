package com.itheima.test1;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三", 30);
        System.out.println(t.getName() + "---" + t.getAge());

        Student s = new Student("李四", 24, 100);
        System.out.println(s.getName() + "---" + s.getAge() + "---" + s.getScore());
    }
}
