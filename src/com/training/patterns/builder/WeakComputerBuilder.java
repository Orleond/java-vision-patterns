package com.training.patterns.builder;

public class WeakComputerBuilder extends CumputerBuilder {
    @Override
    void buildHDD() {
        computer.setHdd(new SATATwo());
    }

    @Override
    void buildProcessor() {
        computer.setProcessor("i3 1.8");
    }

    @Override
    void buildRam() {
        computer.setRam(2_000);
    }
}
