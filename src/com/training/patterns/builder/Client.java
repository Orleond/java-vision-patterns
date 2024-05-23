package com.training.patterns.builder;

public class Client {
    public static void main(String[] args) {
        Headman headman = new Headman();
        headman.setBuilder(new WeakComputerBuilder());

        Computer computer = headman.buildComputer();

        System.out.println(computer);
    }
}
