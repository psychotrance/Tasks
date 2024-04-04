package Lesson10Static_constants.Task3;

public class PrimeArray {
    public static void main(String[] args) {
        int[] primeNums = new int[10];
        FindPrimeNum first = new FindPrimeNum(primeNums.length);

        for (int i = 0; i < primeNums.length; i++) {
            if (i == 0) {
                primeNums[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNums[i - 1] + addingValue;
                primeNums[i] = first.findPrimeNum(number, primeNums, i);
                System.out.println(primeNums[i]);
            }
        }
    }
}