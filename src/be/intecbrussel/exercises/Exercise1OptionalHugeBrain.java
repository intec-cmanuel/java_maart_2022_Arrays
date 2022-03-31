package be.intecbrussel.exercises;

import java.util.Arrays;

public class Exercise1OptionalHugeBrain {
    public static void main(String[] args) {
        boolean[] primeChecker = new boolean[10000000];
        int[] primeNumbers = new int[500000];
        int primeArrayIndex = 0;

        Arrays.fill(primeChecker, true);

        for (int index = 2; index < primeChecker.length && primeArrayIndex < primeNumbers.length; index++) {
            if (!primeChecker[index]) {
                continue;
            }

            primeNumbers[primeArrayIndex] = index;
            primeArrayIndex++;

            for (int notPrime = index*2; notPrime < primeChecker.length; notPrime+=index) {
                primeChecker[notPrime] = false;
            }
        }

        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }
    }
}

