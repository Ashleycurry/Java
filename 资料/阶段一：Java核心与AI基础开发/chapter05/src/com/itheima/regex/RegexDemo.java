package com.itheima.regex;

public class RegexDemo {
    /*
        正则表达式: 本质来说就是一个字符串, 可以指定规则, 来校验其它的字符串
     */
    public static void main(String[] args) {

        /*
            1. 必须是1开头
            2. 长度11位
            3. 第二位 3~9
            4. 全部都是数字
         */

        String telRegex = "[1][3-9]\\d{9}";

        System.out.println("15612341234".matches(telRegex));
        System.out.println("12612341234".matches(telRegex));
        System.out.println("25612341234".matches(telRegex));
        System.out.println("15612a41234".matches(telRegex));
        System.out.println("1561234123".matches(telRegex));

        /*
            zhangSan@itcast.cn
            zhang_san@163.com
            123456@qq.com
            zhangsan@sina.com
            zhangsan@itcast.qq.com
            zhangsan@xxx.edu
            zhangsan@xxx.org
         */

        String emailRegex = "\\w+@[a-z0-9]{2,10}(\\.[a-z]{2,3})+";
        System.out.println("---------------------");
        System.out.println("zhangSan@itcast.cn".matches(emailRegex));
        System.out.println("zhang_san@163.com".matches(emailRegex));
        System.out.println("123456@qq.com".matches(emailRegex));
        System.out.println("zhangsan@sina.com".matches(emailRegex));
        System.out.println("zhangsan@itcast.qq.com".matches(emailRegex));
        System.out.println("zhangsan@xxx.edu".matches(emailRegex));
        System.out.println("zhangsan@xxx.org".matches(emailRegex));


    }
}
