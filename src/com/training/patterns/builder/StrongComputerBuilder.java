package com.training.patterns.builder;

public class StrongComputerBuilder extends CumputerBuilder {
    @Override
    void buildHDD() {
        computer.setHdd(new SATATree());
    }

    @Override
    void buildProcessor() {
        computer.setProcessor("i7 3.1");
    }

    @Override
    void buildRam() {
        computer.setRam(16_000);
    }
}
