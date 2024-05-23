package com.training.patterns.builder;

abstract public class CumputerBuilder {
    Computer computer;

    void createComputer() {
        computer = new Computer();
    }

    Computer getComputer() {
        return computer;
    }

    abstract void buildHDD();
    abstract void buildProcessor();
    abstract void buildRam();
}
