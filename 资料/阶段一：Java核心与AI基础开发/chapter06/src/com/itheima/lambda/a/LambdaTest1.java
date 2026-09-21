package com.itheima.lambda.a;

public class LambdaTest1 {
    public static void main(String[] args) {

        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部类重写后的show方法...");
            }
        });

        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部类重写后的show方法...");
            }
        });

        useShowHandler(() -> System.out.println("Lambda表达式重写后的show方法..."));

    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }

}

@FunctionalInterface
interface ShowHandler {
    void show();
}