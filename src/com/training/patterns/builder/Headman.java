package com.training.patterns.builder;

public class Headman {
    private CumputerBuilder builder;

    public void setBuilder(CumputerBuilder builder) {
        this.builder = builder;
    }

    Computer buildComputer() {
        builder.createComputer();
        builder.buildProcessor();
        builder.buildRam();
        builder.buildHDD();

        return builder.getComputer();
    }
}
