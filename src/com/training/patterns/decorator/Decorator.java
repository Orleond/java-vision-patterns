package com.training.patterns.decorator;

abstract public class Decorator implements Product {
    final Product product;

    protected Decorator(Product product) {
        this.product = product;
    }
}
