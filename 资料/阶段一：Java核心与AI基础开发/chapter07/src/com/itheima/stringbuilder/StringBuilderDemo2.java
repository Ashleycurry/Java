package com.itheima.stringbuilder;

public class StringBuilderDemo2 {
    /*
        StringBuilder是字符串的缓冲区, 可以将其理解为是一种容器.
                    - 容器可以添加任意数据类型, 但是只要进入这个容器, 全部变成字符串.

        StringBuilder是一个可变的字符序列.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("红色");
        System.out.println(sb);

        sb.append("蓝色");
        System.out.println(sb);

        sb.append("绿色");
        System.out.println(sb);
    }

    private static void method() {
        StringBuilder sb = new StringBuilder();

        sb.append(10);
        sb.append('a');
        sb.append(12.3);
        sb.append(false);
        sb.append("你好");

        System.out.println(sb);
    }
}
