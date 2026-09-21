package com.itheima.operator;

public class OperatorDemo2 {
    /*
        自增自减运算符:  ++ --
        使用方式: 可以放在变量的前面, 也可以放在变量的后面

        使用细节:
            1. 单独使用: 符号在前在后没有区别的
                   int a = 10;
                   ++a;
                   a++;

            2. 参与运算使用
                   ++在前: 先自增再操作
                   ++在后: 先操作再自增

         注意事项: 自增自减运算符, 只能操作变量, 不能操作字面量.
     */
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;        // a = 11, b = 11
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = c++;        // d = 10, c = 11
        System.out.println(c);
        System.out.println(d);

        // 10 = 11;
        // System.out.println(10++);
    }
}
