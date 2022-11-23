package counterAggregation;

public class Zadacha10_1 {
    public static void main(String[] args) {
        CounterService counters=new CounterService();

        Counter[] counterss=new Counter[10];
        counterss[0]=new Counter("Газ",0,"м3");
        counterss[1]=new Counter("Вода",0,"м3");
        counterss[2]=new Counter("Мусор",0,"м3");

/*
        Counter gasCounter=new Counter("Газ",0,"м3");
        Counter waterCounter=new Counter("Вода",0,"м3");
        Counter trashCounter=new Counter("Мусор");
*/

        counterss[0].setCounter(20);
        counterss[1].setCounter(30);

        printCounterValue(counterss[0]);
        printCounterValue(counterss[1]);
        printCounterValue(counterss[2]);

        counters.addCounters("1111");
        counters.addCounters("2222");
        counters.addCounters("3333");
    }
    private static void printCounterValue(Counter counter) {
        System.out.printf("%s: %d %s\n", counter.getNAME(), counter.getCounter(), counter.getUNITS());
    }
}