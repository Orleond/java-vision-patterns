package com.training.patterns.abstract_factory;

public class AbstractFactoryTutorial {
    public static void main(String[] args) {
        AbstractFactory chocolateFactory = new ChocolateFactory();
        chocolateFactory.getCake().printName();
        chocolateFactory.getMilkCocktail().printName();
        System.out.println();
        var creamFactory = new CreamFactory();
        creamFactory.getCake().printName();
        creamFactory.getMilkCocktail().printName();
    }
}
