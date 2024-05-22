package com.training.patterns.abstract_factory;

public class ChocolateMilkCocktail implements MilkCocktail {
    @Override
    public void printName() {
        System.out.println("Milk cocktail chocolate");
    }

    @Override
    public void printPrice() {
        System.out.println("87");
    }
}
