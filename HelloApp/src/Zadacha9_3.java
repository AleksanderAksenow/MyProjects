import java.util.Scanner;

/* *
 * Вычислить из записать в массив первые 10 простых чисел.
 * <p>
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * <p>
 * Вывести в консоль сумму всех элементов полученного массива.
 * <p>
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.
 */
public class Zadacha9_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Сколько Вам сложить первых простых чисел?:");
        int lim= scanner.nextInt();
        int[] primeNumbers = new int[lim];
        FindPrime fp=new FindPrime();

        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = fp.findNextPrimeNumber(number, primeNumbers, i);
            }
        }

        System.out.println(fp.sum(primeNumbers));
    }

}