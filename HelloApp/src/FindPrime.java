public class FindPrime {
    final int[] PRIMENUMBERS;

    public FindPrime(int lim) {
        PRIMENUMBERS = new int[lim];

    }
    public void zapolnenie(){
        for (int i = 0; i < PRIMENUMBERS.length; i++) {
            if (i == 0) {
                PRIMENUMBERS[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = PRIMENUMBERS[i - 1] + addingValue;
                PRIMENUMBERS[i] = findNextPrimeNumber(number, i);
            }
        }

    }
    //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
//    заполнения одного элемента массива
    public int findNextPrimeNumber(int number, int currentIndex) {
        boolean isPrime = this.isPrime(number, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return this.findNextPrimeNumber(number, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    public boolean isPrime(int number, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / PRIMENUMBERS[j] > 1) {
            if (number % PRIMENUMBERS[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }

    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    public int sum(int[] numbers) {
        return this.sum(numbers, 0);
    }

    public int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + this.sum(numbers, i + 1);
    }

}
