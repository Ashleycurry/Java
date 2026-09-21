package com.itheima.block;

public class CodeBlock {
    /*
        1. 局部代码块
                位置: 方法中的一对{}
                作用: 限定变量的生命周期, 提早释放内存.
        2. 构造代码块
                位置: 类中方法外的一对 {}
                特点: 创建对象的时候被调用执行, 无论使用哪一个构造方法创建对象, 都要执行构造代码块
                            - 优先于构造方法执行.
                作用: 如果发现所有构造方法中, 存在相同的代码, 就可以考虑讲这段相同的代码抽取到构造代码块中.
        3. 静态代码块
                位置: 类中方法外的一对 {} 需要加入static关键字
                特点: 随着类的加载而执行
                            - 字节码加载的时候, 静态代码块就会执行, 因为字节码文件只加载一次, 静态代码块也只执行一次.
                作用: 用于执行一些初始化操作.
        4. 同步代码块: 多线程的章节讲
     */
    public static void main(String[] args) {
        {
            int num = 10;
            System.out.println(num);
        }

        Student stu1 = new Student();
        Student stu2 = new Student(10);
    }
}


class Student {

    static {
        System.out.println("Student类的静态代码块");
    }

    {
        System.out.println(123);
    }

    public Student() {
        System.out.println("Student类的空参数构造方法...");
    }

    public Student(int num) {
        System.out.println("Student类的带参数构造方法...");
    }

}