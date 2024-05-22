package com.training.patterns.decorator;

public class Shop {
    public static void main(String[] args) {
        Product milk = new Milk(50);

        Product milkDiscount = new MilkDiscount(new MilkDiscount(milk));

        System.out.println(milkDiscount.getPrice());
    }
}
