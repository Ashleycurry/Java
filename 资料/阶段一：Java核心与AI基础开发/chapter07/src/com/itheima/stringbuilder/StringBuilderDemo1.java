package com.itheima.stringbuilder;

public class StringBuilderDemo1 {
    /*
        StringBuilder可以提高字符串的操作效率.

                String, 10万次拼接耗时: 2550毫秒
                StringBuilder, 10万次拼接耗时: 8毫秒
     */
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 100000; i++){
            sb.append(i);
        }

        System.out.println(sb);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void method() {
        // 1970年1月1日 0时0分0秒到现在所经历的毫秒值
        long start = System.currentTimeMillis();

        String s = "";

        for(int i = 1; i <= 100000; i++){
            s += i;
        }

        System.out.println(s);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
