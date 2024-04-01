/**
 * Вычислить и записать в массив первые 10 простых чисел.
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * Вывести в консоль сумму всех элементов полученного массива.
 */
public class PrimeNum1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int num = array[i - 1] + addingValue;
                boolean isPrime = false;
                while (!isPrime) {
                    for (int j = i - 1; j >= 0 ; j--) {
                        if (num % array[j] == 0) {
                            num += addingValue;// вот где была моя ошибка и я ее очень долго не хотел видеть(((
                            break;
                        } else {
                            isPrime = true;
                        }
                    }
                }
                if (isPrime) {
                    array[i] = num;
                }
            }
        }
        int result = 0;
        for (int n : array) {
            System.out.println(n);
            result += n;
        }
        System.out.println(result);
    }
}