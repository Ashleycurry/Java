package com.itheima.string;

public class StringMethodDemo1 {
    /*
        String类用于比较的方法
        
            public boolean equals方法(要比较的字符串)             完全一样结果才是true, 否则为false
            public boolean equalsIgnoreCase(要比较的字符串)		忽略大小写的比较
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2);       // false
        System.out.println(s1.equals(s2));  // true

        String s3 = "ABC";
        System.out.println(s1.equals(s3));  // false
        System.out.println(s1.equalsIgnoreCase(s3));    // true
    }
}
