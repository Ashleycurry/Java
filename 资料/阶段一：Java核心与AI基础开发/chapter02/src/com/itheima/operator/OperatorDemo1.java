package com.itheima.operator;

public class OperatorDemo1 {
    /*
        / : Java中整数相除结果只会得到整数, 如果想要得到小数, 需要有小数参与运算
        % : 取模, 获取除法之后剩下的余数
     */
    public static void main(String[] args) {
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);

        System.out.println("----------------------");

        System.out.println(5 % 3);
        System.out.println(4 % 3);
        System.out.println(3 % 3);
        System.out.println(2 % 3);
        System.out.println(1 % 3);
    }
}
