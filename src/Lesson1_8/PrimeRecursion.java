package Lesson1_8;
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
            //fixme: слишком много закинул в if-else. С тем же эффектом можно было сделать что-то такое:
            //int current = i == 0 ? i : i - 1;
            //primeNums[i] = indPrime(i, primeNums[current]);
            //System.out.println(primeNums[i]);

            //Answer: Вообще я вывод значений массива в консоль
            //Сделал для контроля самого себя, если что, его можно добавить после if-else, это я усвоил.
            //Сейчас я его убрал
            //И вводить новую переменную current: разве не избыточно?
            //Вроде как через if-else все отлично читается
            //Или я тебя как-то не так понял?
            if (i == 0) {
                primeNums[i] = findPrime(i, primeNums[i]);
            } else {
                primeNums[i] = findPrime(i, primeNums[i - 1]);
            }
            System.out.println(primeNums[i]);
        }
        System.out.println(sumPrimeNums(primeNums, 0, 0));
    }

    static int findPrime(int index, int num) {
        int addingValue = index == 1 ? 1 : 2;
        num += addingValue;
        //fixme: index < 1 ?
        //Всё правильно, если index != 1 (в данном случае 0)
        //То addingValue = 2;
        //Индексы массива начинаются с Нуля, так же, как и Поиск Простых чисел
        //Но это так именно в моём решении
        //Или ты имеешь ввиду, что это тоже избыточно?
        if (index == 0 || index == 1) {
            return num;
//fixme: DONE. избыточный else. Программа и так сюда не дойдет, если зайдет в if выше
        }
        boolean isPrime = false;
            while (!isPrime) {
                //fixme: DONE. я бы лучше юзал Math.sqrt(num). Суть та же, но логика будто бы прозрачнее
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    //fixme: DONE. тернаркой было бы лаконичнее
                    //надеюсь, это именно то, что ты хотел увидеть от меня:)
                    isPrime = num % i == 0 ? false : true;
                    if (!isPrime) {
                        return findPrime(i, num);
                    }
                }
            }
        return num;
    }

    static int sumPrimeNums(int[] array, int index, int sum) {
        //fixme: DONE. if-else - констуркция, которая на самом деле нужна очень редко. Гораздно чаще достаточно использовать просто if:
        if (index >= array.length) {
            return sum;
        }

        sum += array[index];
        return sumPrimeNums(array, index + 1, sum);

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