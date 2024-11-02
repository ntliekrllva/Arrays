package ru.kirillova.arrays;

public class Main {
    public static void main(String[] args) {
        evenNumbers();
        oddNumbers();
        primeNumbers();
        sumNumbers();
        arrDifference();
        zeroCounter();
    }

    public static void evenNumbers() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int evenNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println("Количество четных чисел:" + evenNumbers);
    }

    public static void oddNumbers() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int oddNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                oddNumbers++;
            }
        }
        System.out.println("Количество нечетных чисел: " + oddNumbers);
    }

    public static void primeNumbers() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int primeNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (primeCheck(arr[i])) {
                primeNumbers++;
            }
        }
        System.out.println("Количество простых чисел: " + primeNumbers);
    }

    public static boolean primeCheck(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void sumNumbers() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int sumNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            sumNumbers = sumNumbers + arr[i];
        }
        System.out.println("Сумма чисел в массиве: " + sumNumbers);
    }

    public static int arrDifference() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        int result = evenSum - oddSum;
        System.out.println("Разность между суммой чисел " + result);
        return result;
    }

    public static int zeroCounter() {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeroCount++;
        }
        System.out.println("Количество нулей в массиве: " + zeroCount);
        return zeroCount;
    }
}

