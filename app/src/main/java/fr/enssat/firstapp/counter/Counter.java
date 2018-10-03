package fr.enssat.firstapp.counter;

public class Counter {

    static final int RESET_VALUE = 0;

    int value = RESET_VALUE;

    public int get() {
        return value;
    }

    public void inc() {
        value++;
    }

    public void reset() {
        value = RESET_VALUE;
    }

    public boolean isReseted() {
        return value == RESET_VALUE;
    }
}
