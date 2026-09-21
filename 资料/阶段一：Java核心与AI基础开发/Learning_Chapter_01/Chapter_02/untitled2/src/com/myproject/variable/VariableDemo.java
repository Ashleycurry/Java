package com.myproject.variable;

public class VariableDemo {
    public static void main(String[] args) {
        // 定义变量
        // 1.变量必须定义才能使用
        // 2.变量是什么类型就只能装什么类型数据
        // 3.变量从定义开始到}结束开始
        // 4.同一个范围内，变量的名称不能一样
        // 5.变量定义的时候可以不赋初值，但在使用的时候，变量里必须有值

        // 字节数据
        byte bt = 12;
        // 短整型数据
        short num1 = 12;
        // 整型数据
        int num2 = 12;
        // 长整型数据
        long lg = 12;
        // 单精度数据
        float ft = 12;
        // 双精度数据
        double db = 12;
        // 字符数据
        char cr = 12;
        // 布尔数据
        boolean bl = false;
        // 字符串数据
        String name = "这就是Java！";

        System.out.println(bt);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(lg);
        System.out.println(ft);
        System.out.println(db);
        System.out.println(cr);
        System.out.println(bl);
        System.out.println(name);

        // 数据类型 变量名 = 初始数据
        int age = 18;
        System.out.println(age);

        double score = 99.5;
        System.out.println(score);

        // 变量修改
        int age_01 = 18;
        age_01 = 19;
        System.out.println(age_01);
        age_01 = age_01 + 1;
        System.out.println(age_01);

        // 类型优先级体现
        double num = 9.9;
        System.out.println(num);
        num = num - 5.2;
        System.out.println(num);
        num = num + 3000;
        System.out.println(num);

        // 字符的存储原理：存储的是字符的编号的二进制
        System.out.println('a' + 1); // 98
        System.out.println('A' + 1); // 66
        System.out.println('0' + 1); // 49

        // 程序中书写 二进制 八进制 十六进制
        int a1 = 0B11111010; // 二进制0B开头
        System.out.println(a1);

        int a2 = 0372; // 八进制0开头
        System.out.println(a2);

        int a3 = 0XFA; // 十六进制OX开头
        System.out.println(a3);

    }
}
