package com.training.patterns.strategy;

public class DoorA {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void move() {
        strategy.openClose();
    }
}
