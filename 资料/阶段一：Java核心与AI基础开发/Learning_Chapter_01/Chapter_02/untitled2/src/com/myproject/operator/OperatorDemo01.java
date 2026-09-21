package com.myproject.operator;

public class OperatorDemo01 {
    public static void main(String[] args) {
        // 基本的算术运算符
        int a = 5;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        // System.out.println(a * 1.0 / b); // 2.5
        System.out.println(a / b);
        System.out.println(a % b);

        int i = 5;
        System.out.println("abc" + i);
        System.out.println(i + 5);
        System.out.println("gggg" + i + 'a');
        System.out.println(i + 'a' + "gggg");

        // 拆分数字的各个位
        int num = 211;
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        System.out.println("个位 " + ge);
        System.out.println("十位 " + shi);
        System.out.println("百位 " + bai);

    }
}
