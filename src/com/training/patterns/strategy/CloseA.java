package com.training.patterns.strategy;

public class CloseA implements Strategy {
    @Override
    public void openClose() {
        System.out.println("Дверь закрыта");
    }
}
