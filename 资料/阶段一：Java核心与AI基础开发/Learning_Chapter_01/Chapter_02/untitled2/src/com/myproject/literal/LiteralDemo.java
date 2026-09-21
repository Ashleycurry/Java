package com.myproject.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        // 1.整数 小数
        System.out.println(30);
        System.out.println(9.9);

        // 2.字符 必须单引号围起来 有且只有一个
        System.out.println('a');
        //System.out.println(''); //报错
        System.out.println(' ');
        System.out.println('中');
        //System.out.println('中国'); //报错

        // 特殊字符
        System.out.println("我是" + '\t' + "curry"); // \t代表Tab空格
        System.out.println("我是" + '\n' + "curry"); // \n代表换行

        // 3.字符串 必须使用双引号围起来 里面内容随意
        System.out.println("");
        System.out.println("    ");
        System.out.println("我真帅");

        // 4.布尔值 真假 true false
        System.out.println(true);
        System.out.println(false);
    }
}
