package be.intecbrussel.verydifficultexercises;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] randomArray = new int[]{7, 3, 8, 2, 3, 7, 7, 8, 13, 2, 99};
        boolean[] booleanArr = new boolean[randomArray.length];
        Arrays.fill(booleanArr, true);

        int count = 1;

        for (int index = 0; index < randomArray.length; index++) {
            // ! wordt gebruikt om een boolean om te draaien (true wordt false, false wordt true)
            // Om in de if blok te komen, moet booleanArr[index] false zijn, zodat die door de
            // uitroepteken true wordt. Een conditie moet true zijn om in de ifblok te komen.
            if (!booleanArr[index]) {
                continue;
            }

            for (int index2 = index+1; index2 < randomArray.length; index2++) {
                if (randomArray[index] == randomArray[index2]) {
                    count++;
                    booleanArr[index2] = false;
                }
            }

            if (count > 1) {
                System.out.println(count + " x " + randomArray[index]);
            }

            count = 1;
        }
    }
}
