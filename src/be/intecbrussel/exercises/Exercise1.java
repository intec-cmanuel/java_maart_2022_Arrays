package be.intecbrussel.exercises;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        // {7,14,21,28,...,

        int[] numbers = new int[20];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = 7 * (index + 1);
        }


        // System.out.println(Arrays.toString(numbers));

        for(int number: numbers){
            System.out.println(number);
        }

        for(int index = numbers.length - 1; index>=0; index--){
            System.out.println(numbers[index]);
        }

        boolean[] booleans = new boolean[]{true,false,true,false,false,true};
        for (boolean b:booleans){
            System.out.println(b);
        }
    }
}
