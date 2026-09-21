package com.itheima.string;

public class StringMethodDemo3 {
    /*
        String类中的截取方法
            public String substring(int beginIndex)     截取到末尾
            public String substring(int beginIndex, int endIndex)  根据指定的索引截取字符串
                  注意点：包头不包尾，包左不包右
     */
    public static void main(String[] args) {
        String s = "itheima";

        String result1 = s.substring(0, 2);
        String result2 = s.substring(2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
