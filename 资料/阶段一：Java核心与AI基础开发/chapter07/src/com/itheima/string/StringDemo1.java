package com.itheima.string;

public class StringDemo1 {
    /*
        String类的特点:
            1. Java程序中的所有字符串文字（例如"abc" ）都是String类的对象
            2. String是不可改变的, 它们的值在创建后无法更改
                    - 想要更改, 需要使用新的对象进行替换.
            3. String虽然不可改变, 但是可以被共享操作.

                    字符串常量池(StringTable): 当我们使用双引号创建字符串对象的时候.
                                                会检查该数据在常量池中是否存在
                                                不存在: 创建新的
                                                存在: 不会创建新的对象, 复用已有的.
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);
    }
}
