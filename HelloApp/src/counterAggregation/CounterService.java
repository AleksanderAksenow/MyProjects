package counterAggregation;


import java.util.Arrays;

public class CounterService {
    private static int lim=10;
    public static String[][] counters=new String[lim][3];
    private static int index=0;

/*    public CounterService(int[] counters) {
        this.counters = counters;
    }*/
    public void addCounters(String name){
        if (index<=lim){
        counters[index][0]=name;
        index++;
            System.out.println(name+" "+index);
            System.out.println(Arrays.toString(counters));}

        else{
            System.out.println("Превышен лимит счетчиков!!!");
        }
    }
}
