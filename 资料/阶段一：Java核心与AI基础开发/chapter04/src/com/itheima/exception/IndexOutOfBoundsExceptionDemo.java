package com.itheima.exception;

public class IndexOutOfBoundsExceptionDemo {
    /*
        数组索引越界异常: IndexOutOfBoundsException 访问了数组中不存在的索引
     */
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};

        for(int i = 0; i <= arr.length; i++){
            // i = 0 1 2 3
            System.out.println(arr[i]);
        }
    }
}
