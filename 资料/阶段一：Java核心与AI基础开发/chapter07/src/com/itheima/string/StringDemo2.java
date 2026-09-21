package com.itheima.string;

public class StringDemo2 {
    /*
        String类的构造方法:
            public String() : 创建空白字符串，不含任何内容
            public String(char[] chs) : 根据字符数组，创建字符串对象
            public String(String original) : 根据传入的字符串，创建字符串对象

            问题: 两种创建字符串对象的方式, 有什么区别?
            回答:
                    1. 双引号直接创建: 数据在常量池中存储
                    2. 构造方法创建: 会在堆内存开辟独立的内存空间.
     */
    public static void main(String[] args) {
        // 创建空白字符串，不含任何内容
        String s1 = new String();
        System.out.println(s1);

        // 根据字符数组，创建字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println(s2);

        // 根据传入的字符串，创建字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        String s4 = "abc";
    }
}
