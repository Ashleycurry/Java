package com.itheima.mthis;

public class ThisTest {
    /*
        this的作用: 调用本类的成员

            this.本类成员变量;
            this.本类成员方法();

        省略规则:
            this.本类成员变量: 如果不涉及重名问题, this.可以省略不写
            this.本类成员方法: this.可以直接省略不写

        this介绍: 代表当前类对象的引用(地址)
            哪一个对象调用的方法, 方法中的this, 就代表哪一个对象

            p1.print() ---> this ---> p1的地址
            p2.print() ---> this ---> p2的地址
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
        p1.print();

        Person p2 = new Person();
        System.out.println(p2);
        p2.print();
    }
}
