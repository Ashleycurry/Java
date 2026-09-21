package com.itheima.test;

public class MethodTest1 {
    /*
        生成方法返回值的快捷键

            1. 方法名().var + 回车
            2. 把光标放在方法名字上, Ctrl + alt + V
     */
    public static void main(String[] args) {
        int max1 = getMax(10, 20);
        int max2 = getMax(200, 100);

        System.out.println(max1);
        System.out.println(max2);

        System.out.println("-------------------------");

        double sum = getSum(11.1, 22.2);
        System.out.println("sum=" + sum);

        int min = getMin(20, 10, 30);
        System.out.println("min=" + min);

        printUserInfo("张三", 23, 180.1, '男');

    }

    public static int getMax(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    /*
        1. 明确参数   double num1, double num2
        2. 明确返回值    double
     */
    public static double getSum(double num1, double num2) {
        return num1 + num2;
    }

    /*
        1. 明确参数     int num1, int num2, int num3
        2. 明确返回值    int
     */
    public static int getMin(int num1, int num2, int num3) {
        int tempMin = num1 < num2 ? num1 : num2;
        int min = tempMin < num3 ? tempMin : num3;
        return min;
    }

    /*
        1. 明确参数     String name, int age, double height, char gender
        2. 明确返回值    void
     */
    public static void printUserInfo(String name, int age, double height, char gender) {
        System.out.println("姓名为:" + name);
        System.out.println("年龄为:" + age);
        System.out.println("身高为:" + height);
        System.out.println("性别为:" + gender);
    }
}
