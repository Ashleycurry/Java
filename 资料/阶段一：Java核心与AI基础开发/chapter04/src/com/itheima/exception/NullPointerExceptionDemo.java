package com.itheima.exception;

public class NullPointerExceptionDemo {
    /*
        空指针异常: NullPointerException
        当引用数据类型变量被赋值为 null 之后, 地址的指向被切断, 还继续访问堆内存数据, 就会引发空指针异常
     */
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};

        // arr = null;
        // System.out.println(arr[0]);

        String name = ClassLoader.getSystemClassLoader().getParent().getParent().getName();
        System.out.println(name);
    }
}
