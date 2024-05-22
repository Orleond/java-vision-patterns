package com.training.patterns.abstract_factory;

public class CreamyMilkCocktail implements MilkCocktail {
    @Override
    public void printName() {
        System.out.println("Milk cocktail creamy");
    }

    @Override
    public void printPrice() {
        System.out.println("60");
    }
}
