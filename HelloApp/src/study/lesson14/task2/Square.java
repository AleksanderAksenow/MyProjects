package study.lesson14.task2;

import java.util.Scanner;

public class Square extends TrueFigure {
    public Square(Scanner in){
        super(in);
    }
@Override
    public void printFigure(){
        printTop(length);
        printBody(length);
        printDown(length);
    }
    public void printTop(int length){
        System.out.print(CORNER);
        for(int i=0;i<length;i++){
            System.out.print(GRAN_GOR);
        }
        System.out.println(CORNER);
    }
    public void printDown(int length){
        System.out.print(CORNER);
        for(int i=0;i<length;i++){
            System.out.print(GRAN_GOR);
        }
        System.out.println(CORNER);
    }
    public void printBody(int length){
        for(int i=0;i<length;i++){
            System.out.print(GRAN_VERT);
            for (int j=0;j<length;j++){
                System.out.print(SPACE);
            }
            System.out.println(GRAN_VERT);
        }
    }

}
