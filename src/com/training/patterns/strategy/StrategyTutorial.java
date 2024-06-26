package com.training.patterns.strategy;

public class StrategyTutorial {
    public static void main(String[] args) {
        DoorA door = new DoorA();

        Strategy open = new OpenA();
        door.setStrategy(open);
        door.move();

        Strategy close = new CloseA();
        door.setStrategy(close);
        door.move();
    }
}
