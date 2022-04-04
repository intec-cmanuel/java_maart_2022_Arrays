package be.intecbrussel.verydifficultexercises;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] randomArray = new int[]{7, 3, 8, 2, 3, 7, 7, 8, 13, 2, 99};


        int totalAmountOfElements = randomArray.length;
        int lastArrayValue = randomArray[totalAmountOfElements - 1];

        for (int index = totalAmountOfElements - 1; index > 0; index--) {
            randomArray[index] = randomArray[index - 1];
        }

        randomArray[0] = lastArrayValue;

        for (int index = 0; index < randomArray.length; index++) {
            System.out.println(randomArray[0]);
        }

        for (int arrayNumber : randomArray) {
            System.out.println(arrayNumber);
        }

        System.out.println(Arrays.toString(randomArray));
    }
}
