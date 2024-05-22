package com.training.patterns.abstract_factory;

public class CreamFactory implements AbstractFactory {
    @Override
    public Cake getCake() {
        return new CreamyCake();
    }

    @Override
    public MilkCocktail getMilkCocktail() {
        return new CreamyMilkCocktail();
    }
}
