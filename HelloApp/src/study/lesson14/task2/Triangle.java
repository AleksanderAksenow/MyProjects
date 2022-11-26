package study.lesson14.task2;

import java.util.Scanner;

public class Triangle extends TrueFigure {
    public Triangle(Scanner in) {
        super(in);
    }

    @Override
    public void printFigure() {
        printTop(length);
        printBody(length);
        printDown(length);
    }

    public void printBody(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(SPACE);
            for (int j = 0; j < length*2+2; j++) {
                if (j==length-i) {
                    System.out.print(BACKSLASH);
                } else if (j==length+i) {
                    System.out.print(SLASH);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.print("\n");
        }
    }

    public void printTop(int length) {
        for (int i = -1; i < length; i++) {
            System.out.print(SPACE);
        }
        System.out.println(CORNER);
    }

    public void printDown(int length) {
        System.out.print(CORNER);
        for (int i = 1; i <= length*2+1; i++) {
            System.out.print(GRAN_GOR);
        }
        System.out.println(CORNER);
    }


}
