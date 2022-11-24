package com.walking.counterAggregation.analytics;;

public class Counter {
    private final String NAME; //Имя счетчика
    private final String UNITS; //Ед. измерения счетчика
    private int counter; //Показания счетчика

    public Counter(String name, int counter, String units) {  //Установка значаний для нового счетчика
        this.counter = counter;
        this.NAME = name;
        this.UNITS = units;
    }

    public void setCounter(int counter) { //Установка показаний

        this.counter = counter;
    }

    public void addCounter(int additive) { //Добавление к показаниям
        this.counter += additive;
    }

    public void zeroCounter() { //Обнуление показаний
        this.counter = 0;
    }

    public String getNAME() {//Возврат имени счетчика

        return NAME;
    }

    public String getUNITS() {//Возврат ед. измерения счетчика

        return UNITS;
    }

    public int getCounter() {//Возврат показаний счетчика

        return counter;
    }
}