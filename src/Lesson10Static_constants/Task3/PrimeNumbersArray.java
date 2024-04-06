package Lesson10Static_constants.Task3;

public class PrimeNumbersArray {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];
        FindPrimeNum first = new FindPrimeNum();

        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = first.findNextPrimeNumber(number, primeNumbers, i);
            }
        }
        System.out.println(sum(primeNumbers, primeNumbers.length - 1));
    }
    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    static int sum(int[] numbers, int endIndex) {
        return sum(numbers, 0, endIndex);
    }

    static int sum(int[] numbers, int i, int endIndex) {
        if (i == endIndex) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1, endIndex);
    }
}
