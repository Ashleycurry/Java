package com.itheima.lambda;

import java.util.Random;

public class LambdaTest3 {
    public static void main(String[] args) {
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100) + 1;
            }
        });

        useRandomNumHandler(() ->
             new Random().nextInt(100) + 1
        );
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }
}

@FunctionalInterface
interface RandomNumHandler {
    int getNumber();
}
