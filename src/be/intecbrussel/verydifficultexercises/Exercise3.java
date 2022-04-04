package be.intecbrussel.verydifficultexercises;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[] randomArray = new int[]{7, 3, 8, 2, 3, 7, 7, 8, 13, 2, 99};
        int[] slightlyBiggerArray = new int[randomArray.length+1];

        int valueToAdd = 40;
        int positionToAdd = 5;

        for (int index = 0; index < slightlyBiggerArray.length; index++) {
            if (index < positionToAdd ){
                slightlyBiggerArray[index] = randomArray[index];
            } else if (index == positionToAdd) {
                slightlyBiggerArray[index] = valueToAdd;
            } else {
                slightlyBiggerArray[index] = randomArray[index-1];
            }
        }

        System.out.println(Arrays.toString(slightlyBiggerArray));

    }
}
