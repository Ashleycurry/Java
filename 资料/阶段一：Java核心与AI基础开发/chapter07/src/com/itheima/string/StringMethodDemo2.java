package com.itheima.string;

public class StringMethodDemo2 {
    /*
        String类中和遍历有关的方法
            public char[]  toCharArray()    将字符串转换为字符数组
            public char chatAt(int index)  根据索引找字符
            public int length() : 返回字符串的长度
     */
    public static void main(String[] args) {

        String s = "itheima";

        // 将字符串转换为字符数组
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        System.out.println("---------------------------------");

        // 根据索引找字符
        for (int i = 0; i < s.length(); i++) {
            // i = 0 1 2 3 4 5 6
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
