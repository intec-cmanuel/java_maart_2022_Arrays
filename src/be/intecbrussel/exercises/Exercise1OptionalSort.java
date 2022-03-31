package be.intecbrussel.exercises;

import java.util.Arrays;
import java.util.Random;

public class Exercise1OptionalSort {
    public static void main(String[] args) {
        new Random();
        int[] arrayRandom = new int[10];
        for (int x = 0; x < arrayRandom.length; x++) {
            arrayRandom[x] = new Random().nextInt(101);
        }


        Arrays.sort(arrayRandom);
        System.out.println(Arrays.toString(arrayRandom));

    }
}

