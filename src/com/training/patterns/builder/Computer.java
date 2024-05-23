package com.training.patterns.builder;

public class Computer {
    private int ram;
    private HDD hdd;
    private String processor;

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", processor='" + processor + '\'' +
                '}';
    }
}
