//package lesson3;

//import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

    /**
     * Написать программу, которая принимает строку с клавиатуры.
     * Если строка == "Hi" - вывести в консоль "Hello",
     * если Bye - Good bye,
     * если How are you - How are your doing.
     * Если любая другая строка - вывести Unknown message.
     * Сделать через switch-case
     */
    public class Zadacha6_1 {
        public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
            Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter string: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
            write("Enter string: ");
//        Объявляем переменную s типа String и записываем в нее значение, введенное с клавиатуры
            String s = scanner.nextLine();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
            scanner.close();

//        Используем конструкцию switch-case для переменной s
 /*           switch (s) {
                case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                    System.out.println("Hello");
//                Вызываем оператор break, чтобы выйти из switch-case
                    break;

                case "Bye":
                    System.out.println("Good bye");
                    break;

                case "How are you":
                    System.out.println("How are your doing");
                    break;

                default:  // Если значение s не совпадает ни с одним кейсом
                    System.out.println("Unknown message");
            }*/
            cicle(s);
        }

        static void cicle(String line) {
            switch (line) {
                case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                    write("Hello");

//                Вызываем оператор break, чтобы выйти из switch-case
                    break;

                case "Bye":
                    write("Good bye");
                    break;

                case "How are you":
                    write("How are your doing");
                    break;

                default:  // Если значение s не совпадает ни с одним кейсом
                    write("Unknown message");
            }
        }
        static void write(String str){
            System.out.println(str);}
    }
