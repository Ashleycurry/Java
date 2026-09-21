package com.itheima.loop;

public class ForDemo2 {
    /*
        注意事项:
            1. 循环 { } 中定义的变量, 在每一轮循环结束后, 都会从内存中释放
            2. 循环 ( ) 中定义的变量, 在整个循环结束后, 都会从内存中释放
            3. 循环语句 ( ) 和  { } 之间不要写分号
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int a = 10;
            System.out.println("HelloWorld");
        }
    }
}
