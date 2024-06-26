package com.training.patterns.abstract_factory;

public class ChocolateFactory implements AbstractFactory {
    @Override
    public Cake getCake() {
        return new ChocolateCake();
    }

    @Override
    public MilkCocktail getMilkCocktail() {
        return new ChocolateMilkCocktail();
    }
}
