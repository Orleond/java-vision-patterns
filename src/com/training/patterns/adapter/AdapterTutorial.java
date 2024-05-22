package com.training.patterns.adapter;

import java.util.ArrayList;

public class AdapterTutorial {
    private final ArrayList<PrintInterface> printInterfaces = new ArrayList<>();

    public void p() {
        for (PrintInterface printInterface : printInterfaces) {
            printInterface.consolePrint();
        }
    }

    public void add(PrintInterface printInterface) {
        printInterfaces.add(printInterface);
    }
}
