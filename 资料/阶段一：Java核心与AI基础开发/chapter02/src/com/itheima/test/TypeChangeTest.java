package com.itheima.test;

public class TypeChangeTest {
    /*
        阅读代码, 分析是否存在错误, 如果有请说明原因并改正.

        byte b1 = 3;
        byte b2 = 4;
        byte b3 = b1 + b2;

        原因: b1和b2是两个byte类型的数据, 相加的时候会直接提升为int, 提升之后就是两个int相加, 结果还是int
                这里将int类型的结果, 赋值给byte类型的变量, 属于大的给小的赋值, 不能直接赋值, 需要强转, 或者改变类型.

        改正:
                1. byte b3 = (byte)(b1 + b2);
                2. int b3 = b1 + b2;

        byte b = 3 + 4;

        回答: 这句代码不会出现错误, Java存在字面量优化机制, 在编译的时候(javac)就会完成运算
                字节码文件: byte b = 7;
     */
    public static void main(String[] args) {
        byte b = 3 + 4;
        System.out.println(b);
    }
}
