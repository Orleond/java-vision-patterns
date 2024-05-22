package com.training.patterns.adapter;

public class Client {
    public static void main(String[] args) {
        PrintInterface print = new PrinterSecond();
        print.consolePrint();

        var printInterface = new PrinterComp(new Printer());
        printInterface.consolePrint();
    }
}
