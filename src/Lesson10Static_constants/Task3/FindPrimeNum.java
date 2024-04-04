package Lesson10Static_constants.Task3;

public class FindPrimeNum {
    public int[] primeNums;
    public int number;
    public int addingValue;

    FindPrimeNum(int arrayLength) {
        this.primeNums = new int[arrayLength];
        this.number = number;
    }

    public int findPrimeNum(int number, int[] primeNums, int currentIndex) {
        boolean isPrime = isPrime(number, primeNums, currentIndex);

        if (isPrime)
            return number;

        number += 2;

        return findPrimeNum(number, primeNums, currentIndex);
    }

    static boolean isPrime(int number, int[] primeNums, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNums[j] > 1) {
            if (number % primeNums[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }
}