/**
 * Вычислить и записать в массив первые 10 простых чисел.
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * Вывести в консоль сумму всех элементов полученного массива.
 * Нахождение простых чисел и вычисление суммы реализовать,
 * используя рекурсивные методы.
 */
public class PrimeRecursion {
    public static void main(String[] args) {
        int[] primeNums = new int[10];

        for (int i = 0; i < primeNums.length; i++) {
            if (i == 0) {
                primeNums[i] = findPrime(i, primeNums[i]);
                System.out.println(primeNums[i]);
            } else {
                primeNums[i] = findPrime(i, primeNums[i - 1]);
                System.out.println(primeNums[i]);
            }
        }
        System.out.println(sumPrimeNums(primeNums, 0, 0));
    }

    static int findPrime(int index, int num) {
        int addingValue = index == 1 ? 1 : 2;
        num += addingValue;
        if (index == 0 || index == 1) {
            return num;
        } else {
            boolean isPrime = false;
            while (!isPrime) {
                for (int i = 2; i <= num / i; i++) {
                    if ((num % i) == 0) {
                        return findPrime(i, num);
                    } else {
                        isPrime = true;
                    }
                }
            }
        }
        return num;
    }

    static int sumPrimeNums(int[] array, int index, int sum) {
        if (index < array.length) {
            sum += array[index];
            return sumPrimeNums(array, index + 1, sum);
        } else {
            return sum;
        }
    }
}
/*
Откровенно говоря, решение не до конца мною выдумано
Очень долго не мог понть, откуда взять нужные делители для проверок
И наткнулся на решение в книге Шилдта
Java полное руководство.
Так что снова не на 100% решение моё(((
Но всё остальное - вроде сам (но это не точно).
29.03.2024г.
 */