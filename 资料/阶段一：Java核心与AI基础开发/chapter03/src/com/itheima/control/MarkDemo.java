package com.itheima.control;

public class MarkDemo {
    /*
        思考: 如果遇到了循环嵌套, break和continue操作的是内循环还是外循环?
     */
    public static void main(String[] args) {
        lo:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 2) {
                    break lo;
                }
                System.out.println("HelloWorld");
            }
        }
    }
}
