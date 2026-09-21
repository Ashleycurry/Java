package com.itheima.mabstract;

public class AbstractDemo2 {
    /*
        抽象类的注意事项:
            1. 抽象类不能实例化
                    原因: 如果允许创建对象, 就可以调用抽象方法了, 这样做没意义
            2. 抽象类不能创建对象, 里面还是存在构造方法
                    原因: 构造方法是交给子类通过super()调用的.
            3. 抽象类中可以编写普通的方法
                    原因: 子类可以直接继承到这些方法使用.
            4. 抽象类的子类
                    A: 重写所有抽象方法
                    B: 将子类改造为抽象类
     */
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
    }
}

abstract class Fu {

    public Fu(){
    }

    public abstract void show();
    public abstract void show2();

    public void method(){
        System.out.println("method...");
    }
}

class Zi extends Fu {

    public Zi(){
        super();
    }

    @Override
    public void show() {

    }

    @Override
    public void show2() {

    }
}

abstract class Zi2 extends Fu {

}