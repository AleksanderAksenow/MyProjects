
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                int number = 2; //Число для проверки на простоту
                int[] SimpleArr = new int[10]; // Массив для хранения простых чисел
                int count = 0; //Счетчик ячеек массива
                int rem; //Остаток от деления
                int sum =0;
                boolean chSimple = true; //Результат проверки на чистоту
    //            while (count < 10) {
                    for (count = 0;count!=10 ; ) {
                        for (int j = 2; j <= number / 2; j++) {
                            rem = number % j;
                            if (rem == 0) {
                                chSimple = false;
                            }
                        }
                        if (chSimple) {
                            SimpleArr[count] = number;
                            count++;
                        }
                  //      if (count == 10) break;
                        chSimple = true;
                        number++;
                    }
      //          }
                for (int k : SimpleArr) {
                    sum+= k;
                    System.out.print(k + " ");
                }
                System.out.println("\nСумма значений массива: "+ sum);

      /*  Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Введите A: ");
        int a = in.nextInt();
        System.out.print("Введите B: ");
        int b = in.nextInt();
        boolean c = true;
        int i = 0;
        int qv=0;
        c=a>b;
        if ((a%2==0)^(b%3==0)) System.out.println("a>b:" + c);
        if ((a%2==0)&(a%3==0))
            if (Math.pow(a,b)>=Integer.MAX_VALUE&Math.pow(a,b)>=Integer.MIN_VALUE) System.out.println("Результат выражения слишком большой!");
            else System.out.println(Math.pow(a,b));*/

 /*       System.out.print("Введите фамилию: ");
        String name1 = in.nextLine();
        System.out.print("Введите отчество: ");
        String name2 = in.nextLine();
        //       System.out.println(name+" "+name1+" "+name2);
        System.out.printf("Имя:%s,Фамилия:%s, Отчество:%s",name,name1,name2);*.
 /*       switch (x) {
            case "Hi": System.out.println("Hello!"); break;
            case "Bye": System.out.println("BB!");break;
            case "One": System.out.println("Two!");break;
            default: System.out.println("WARNING!");

        }*/
/*        if (x.equals("Hi")) System.out.println("Hello!");
        else if (x.equals("Bye")) System.out.println("Good Bye!");
        else if (x.equals("One")) System.out.println("Two");
        else System.out.println("WARNING!!!");*/
        //    System.out.println("Введите число Б: ");
        //    int y = in.nextInt();
        //
        //       System.out.println("Введите действие 1 - сложение 2 - вычитание 3 - умножение 4 - деление: ");
        //    int a = in.nextInt();
    /*    if (x%2==0) System.out.println("Умножение:"+(x*y));
        else if (x==y) System.out.println("Числа равны");

        else System.out.println("Деление:"+((double)x/y));*/
      /*  case 1: System.out.println("Результат:"+(x+y));   break;
        case 2: System.out.println("Результат:"+(x-y));   break;
        case 3: System.out.println("Результат:"+(x*y));   break;
        case 4: System.out.println("Результат:"+(x/y));   break;
        default: System.out.println("Херня"); }}
        else System.out.println("На ноль делить нельзя!");*/


        //System.out.println("Введите B: ");
        //int b = in.nextInt();

        /* if (a<=0) System.out.println("Бомж");
        else if (a<100) System.out.println("Получка:"+a*1.05);
        else if (a<200) System.out.println("Получка:"+a*1.07);
        else System.out.println("Получка:"+a*1.1);*/
 /*       char ch='\u0097';
        System.out.println(ch);*/
//in.close();
    }
}