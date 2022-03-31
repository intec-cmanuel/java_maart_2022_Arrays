package be.intecbrussel.exercises;

import java.util.Scanner;

public class Exercise1Optionals {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int dividableBy, count;
//
//        System.out.println("bereken tot nummer n : ");
//        int limit = sc.nextInt();
//
//        int[] prime = new int[limit];
//        int primeArrayIndex = 0;
//
//        for(int numberToTest = 2; numberToTest <= limit; numberToTest++) {
//            count=0;
//
//            for( dividableBy = 1; dividableBy <= numberToTest; dividableBy++) {
//                if( numberToTest % dividableBy == 0) {
//                    count++;
//                }
//            }
//
//            if(count==2) {
//                if (numberToTest != 0) {
//                    prime[primeArrayIndex] = numberToTest;
//                    primeArrayIndex++;
//                }
//            }
//        }
//
//        for(int index=0; (index<=prime.length - 1) && (prime[index] != 0) ; index++){
//            System.out.println(prime[index]);
//        }


        int[] numbers = new int[500000];
        int primeNumber = 2;

        for (int index = 0; index < numbers.length; primeNumber++) {
            int primeDivisionCount = 0;
            int testCase = 0;
            int primeTest = numbers[testCase];

            while (testCase < index) {
                if (primeNumber % primeTest == 0) {
                    primeDivisionCount++;
                    break;
                }
                testCase++;
                primeTest = numbers[testCase];
            }

            if (primeDivisionCount == 0) {
                numbers[index] = primeNumber;
                index++;
            }
        }

        for (int n : numbers) {
            System.out.println(n);
        }


    }


}
