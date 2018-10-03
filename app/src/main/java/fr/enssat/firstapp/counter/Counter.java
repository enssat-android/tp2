package fr.enssat.firstapp.counter;

public class Counter {

    int value = 0;

    public int get() {
        return value;
    }

    public void inc() {
        value++;
    }

    public void reset() {
        value = 0;
    }
}
