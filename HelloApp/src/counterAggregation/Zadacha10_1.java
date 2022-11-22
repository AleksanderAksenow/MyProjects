package counterAggregation;

public class Zadacha10_1 {
    public static void main(String[] args) {
        int lim=10; //Лимит счетчиков

        Counter[] counterService=new Counter[lim]; // Задание объекта массива счетчиков
        counterService[0]=new Counter("Газ",0,"м3"); //Задание новых счетчиков
        counterService[1]=new Counter("Вода",0,"м3");
        counterService[2]=new Counter("Мусор",0,"м3");
        counterService[3]=new Counter("Электричество",1500,"кВт/ч");

        counterService[0].setCounter(20); //Задание показаний счетчиков
        counterService[1].setCounter(10);
        counterService[2].setCounter(5);

        counterService[1].addCounter(15); //Добавление показаний

        counterService[0].zeroCounter(); //Обнуление показаний

        printCounterValue(counterService[0]);//Печать данных конкретного счетчика
        printCounterValue(counterService[1]);
        printCounterValue(counterService[2]);

        for (Counter a:counterService) { //Печать всех счетчиков
            if (a!=null){
                printCounterValue(a);
            }
        }
    }

    private static void printCounterValue(Counter counter) {
        System.out.printf("%s: %d %s\n", counter.getNAME(), counter.getCounter(), counter.getUNITS());
    }
}