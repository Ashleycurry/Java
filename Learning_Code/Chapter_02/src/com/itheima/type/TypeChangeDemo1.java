package com.itheima.type;

public class TypeChangeDemo1 {
    /*
        隐式转换
            取值范围小的变量或数据, 给取值范围大的变量赋值, 可以直接赋值 (小的给大的, 可以直接给)
            取值范围小的数据, 和取值范围大的数据在一起运算, 小的会先提升为大的, 再进行运算 (确保类型统一)
            byte short char 这三种类型在运算的时候, 会直接提升为 int 类型
     */
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a + b;
    }
}
