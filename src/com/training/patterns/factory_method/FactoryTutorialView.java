package com.training.patterns.factory_method;

import java.util.ArrayList;
import java.util.List;

public class FactoryTutorialView {
    public static void main(String[] args) {
        List<Chocolate> chocolates = new ArrayList<>();

        Factory factory = new CreatorFactory(0);
        var chocolate = factory.create();
        chocolate.printPrice();
    }
}
