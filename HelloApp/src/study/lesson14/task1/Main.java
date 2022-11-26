package study.lesson14.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        final Scanner in = new Scanner(System.in);

        choice=figureChoice(in);

        if (choice==1){
            Square square1=new Square(in);
            square1.printFigure();
        } else if (choice==2) {
            Triangle triangle1=new Triangle(in);
            triangle1.printFigure();
        } else {
            System.out.println("Вы че там выбираете??!!");
        }

        in.close();
    }

    static int figureChoice(Scanner in) {
        System.out.print("Выберите что будем рисовать (1) Квадрат (2) Треугольник:");
        return in.nextInt();
    }


}

