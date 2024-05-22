package com.training.patterns.factory_method;

abstract public class Factory {
    int flag;

    public Factory(int flag) {
        this.flag = flag;
    }

    abstract Chocolate create();
}
