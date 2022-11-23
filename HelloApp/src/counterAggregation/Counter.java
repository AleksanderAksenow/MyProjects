package counterAggregation;

import static counterAggregation.CounterService.*;

public class Counter {
    private final String NAME;
    private final String UNITS;
    private int counter;

    public Counter(String name) {

        this(name, 0,"м3");
    }

    public Counter(String name, int counter, String units) {
        this.counter = counter;
        this.NAME = name;
        this.UNITS=units;
    //    counters.addCounters(name);
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getNAME() {
        return NAME;
    }
    public String getUNITS() {
        return UNITS;
    }

    public int getCounter() {
        return counter;
    }

/*    public int increase(int value) {
        counter += value;

        return counter;
    }

    public int decrease(int value) {
        counter -= value;

        return counter;
    }

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return --counter;
    }*/
}