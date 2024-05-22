package com.training.patterns.factory_method;

public class CreatorFactory extends Factory {

    public CreatorFactory(int flag) {
        super(flag);
    }

    @Override
    Chocolate create() {
        if (flag == 0)
            return new WhiteChocolate();

        if (flag == 1)
            return new BlackChocolate();

        throw new IllegalArgumentException();
    }
}
