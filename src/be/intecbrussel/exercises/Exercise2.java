package be.intecbrussel.exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);
        String text = keyboardReader.nextLine();

        String[] textArray;
        textArray = text.split(" ");
        for (String s:textArray){
            System.out.println(s);
        }




        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] words = line.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
