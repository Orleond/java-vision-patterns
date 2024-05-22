package com.training.patterns.adapter;

public class PrinterSecond extends Printer implements PrintInterface {
    @Override
    public void consolePrint() {
        this.print();
    }
}
