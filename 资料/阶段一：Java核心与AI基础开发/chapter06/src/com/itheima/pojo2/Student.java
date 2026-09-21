package com.itheima.pojo2;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // this: stu1
        // o : stu2
        if (this == o) {
            // 如果两个对象的地址相同, 代表是同一块内存空间, 里面的内容肯定相同.
            return true;
        }

        // 代码如果可以执行到这里, 说明stu1肯定不是null值
        // stu1不是null, stu2为null, 直接返回false
        // 比较两个对象的字节码, 如果字节码不相同, 代表类型不一致, 返回false
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        // 向下转型, 调用子类特有的属性
        Student student = (Student) o;

        // 比较两个对象的属性值
        return this.age == student.age && Objects.equals(this.name, student.name);
    }


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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
