package study.lesson14.task1;

import java.util.Scanner;

public class TrueFigure {
    int length;
    final char GRAN_GOR='-';
    final char GRAN_VERT='|';
    final char CORNER='*';
    final char SLASH='\\';
    final char BACKSLASH='/';
    final char SPACE=' ';

    public TrueFigure(Scanner in){
        System.out.print("Введите длинну стороны фигуры: ");
        length=in.nextInt();
    }
    public void printFigure(){
    }
}
