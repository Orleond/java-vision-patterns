package com.training.patterns.factory_method;

public class BlackChocolate implements Chocolate {
    private final int price = 10;

    @Override
    public void printPrice() {
        System.out.println(price);
    }
}
