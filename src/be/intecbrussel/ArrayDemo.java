package be.intecbrussel;

public class ArrayDemo {

    public static void main(String[] args) {

        int ageOfMyYoungestBrother = 19;
        int ageOfMyMiddleBrother = 22;
        int ageOfMyOldestBrother = 30;

        int[] agesOfMyBrothers;
        agesOfMyBrothers = new int[]{ageOfMyYoungestBrother, ageOfMyMiddleBrother, ageOfMyOldestBrother}; // 3 gevulde plaatsen
        agesOfMyBrothers = new int[3]; // 3 lege plaatsen

        agesOfMyBrothers[0] = ageOfMyOldestBrother;
        agesOfMyBrothers[1] = ageOfMyYoungestBrother;
        agesOfMyBrothers[2] = ageOfMyMiddleBrother;

//        System.out.println(agesOfMyBrothers[0]);
//        System.out.println(agesOfMyBrothers[1]);
//        System.out.println(agesOfMyBrothers[2]);
//        System.out.println(agesOfMyBrothers[3]);

        for (int index = 0; index < agesOfMyBrothers.length; index++) {
            System.out.println(agesOfMyBrothers[index]);
        }

        for (int number : agesOfMyBrothers) {
            System.out.println(number);
        }

        String text = "Hello I am jean-pierre";

        String[] stringArray = text.split("e");

        for(String s : stringArray) {
            System.out.println(s);
        }

        System.out.println(stringArray.length);
    }

}





































