package be.intecbrussel.verydifficultexercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Toufik {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner reader = new Scanner(System.in);

        int TotaalAantalElement = 20;
        System.out.println("welke getal wil je bijvoegen[0-20]");
        int insert= reader.nextInt();
        System.out.println("op welke positie [0-20]");

        int position = reader.nextInt();

        int[] array = new int[20];

        System.out.println("array zonder verplaatsing ");

        for (int index = 0; index< array.length;index++){
            array[index] = rand.nextInt(10);
            System.out.print(array[index]+ " ");

        }
        // System.out.println( " \n"+"array met een element inserted ");
        array = InsertElement(TotaalAantalElement,array,insert, position);
        System.out.println(" \n"+"array met inserted elemented "+insert+" met positie "+ position+" :\n"+ Arrays.toString(array));


    }
    public static int[] InsertElement(int TotaalElementArray, int[] array, int insertx, int position){

        // een nieuwe array maken met grootte + 1
        int NewArray[] = new int[TotaalElementArray +1];

        // nieuwe element van oude naar nieuwe array plaatsen
        //dan alle oude elementen van de oude array plaatsen tot positiobn
        // dan de rest inserten
        for(int index =0;index < TotaalElementArray+1;index++){

            if(index< position ){//moet geen -1 want boven we hebben uw nieuw array +1 gebruikt
                NewArray[index]=array[index];

            }else if(index == position){
                NewArray[index] = insertx;

            }else{
                NewArray[index] =array[index - 1];
            }


        }
        return NewArray;

    }
}
