package com.training.patterns.state;

public class Open implements State {
    @Override
    public void openClose() {
        System.out.println("Дверь открыта");
    }
}
