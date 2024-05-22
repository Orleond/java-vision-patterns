package com.training.patterns.factory_method;

public class WhiteChocolate implements Chocolate {
    private final int price = 15;

    @Override
    public void printPrice() {
        System.out.println(price);
    }
}
