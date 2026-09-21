package com.itheima.operator;

public class OperatorDemo3 {
    /*
        赋值运算符

            1. 基本赋值运算符 =
            2. 扩展赋值运算符 += -= *= /= %=

                   += : 符号左右两边的数据做加法, 结果赋值给符号左边的变量
                   -= : 符号左右两边的数据做减法, 结果赋值给符号左边的变量
                   ...

        扩展赋值运算符隐含了强转的效果
     */
    public static void main(String[] args) {
        int a = 10;
        a -= 20;
        System.out.println(a);

        int num1 = 10;
        double num2 = 12.3;

        num1 += num2;       // num1 = (int)(10 + 12.3);

        System.out.println(num1);
    }
}
