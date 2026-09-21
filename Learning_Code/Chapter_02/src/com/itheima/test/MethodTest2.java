package com.itheima.test;

public class MethodTest2 {
    public static void main(String[] args) {

    }

    /*
        生成一个方法, 计算两个整数相加的和
     */
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    /*
        生成一个方法, 用于打印用户信息, 信息包括姓名, 年龄, 身高, 性别
     */
    public static void printUserInfo(String name, int age, double height, char gender) {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("身高: " + height);
        System.out.println("性别: " + gender);
    }
}
