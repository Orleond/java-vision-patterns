package com.training.patterns.state;

public class Door {
    State state;

    void setState(State state) {
        this.state = state;
    }

    void changeState() {
        if (state instanceof Open) {
            setState(new Close());
        } else if (state instanceof Close) {
            setState(new Open());
        }
    }

    void move() {
        state.openClose();
    }
}
