package com.itheima.type;

public class TypeChangeDemo2 {
    /*
        强制类型转换: 取值范围大的数据或变量, 给取值范围小的变量赋值, 不允许直接给, 需要强制类型转换
                        简单记: 大的给小的, 不等直接给.

        Alt + Enter : 代码修正快捷键
     */
    public static void main(String[] args) {
        double a = 12.3;
        int b = (int) a;
        System.out.println(b);

        int num1 = 10;
        byte num2 = (byte) num1;
        System.out.println(num2);
    }
}
