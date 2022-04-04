package be.intecbrussel.verydifficultexercises;

public class Exercise1 {
    public static void main(String[] args) {
        int[] randomArray = new int[]{7, 3, 8, 2, 3, 7, 7, 8, 13, 2, 7};

        int smallestNumber = 99999999;
        int secondSmallestNumber = 999999999;

        for (int index = 0; index < randomArray.length; index++) {
            int arrayNumber = randomArray[index];

//            if (arrayNumber == smallestNumber) {
//                continue;
//            }

            if (arrayNumber < smallestNumber) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = arrayNumber;
            } else if (arrayNumber < secondSmallestNumber && arrayNumber > smallestNumber) {
                secondSmallestNumber = arrayNumber;
            }

        }

        System.out.println(smallestNumber);
        System.out.println(secondSmallestNumber);
    }
}
