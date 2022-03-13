package homeWork.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExamTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
//create it in a place, where you use it
        Random random=new Random ();

        System.out.println ("Choose array to work with:" + "\n" + "1:numbers" + "\n" + "2:strings");
        int choiceOne=scanner.nextInt ();
        if (choiceOne == 2) {
            String[] arrayString=new String[arrayLength (scanner)];
            String[] arrayString1=arrayInConsoleString (arrayString, scanner);
            outPutArrayString (arrayString1);
            sortArrayString (arrayString1);
//did not find second String task with random
//number replacement. Do it later. 
        } else {
            System.out.println ("How do you want to initialize array?" + "\n" + "1: from console" + "\n" +
                    "2: random numbers");
            int choicetwo=scanner.nextInt ();
            int[] array=new int[arrayLength (scanner)];
//initialise array and then perform all of the operations. Do not duplicate your code. Do your actions after
//if-else. You will do it anyway, no matter 
//what condition will be true. 
            if (choicetwo == 1) {
                int[] arrayConsole=arrayInConsole (scanner, array);
                outPutArray (arrayConsole);
                determinMaxMin (arrayConsole);
                sorting (arrayConsole);
                findIndex (arrayConsole, scanner);
            } else {
                int[] arrayRandom=arrayInRandom (random, array);
                outPutArray (arrayRandom);
                determinMaxMin (arrayRandom);
                sorting (arrayRandom);
                findIndex (arrayRandom, scanner);
            }

        }

    }
//initRandomArray
    static int[] arrayInRandom(Random random, int[] array) {
        for (int i=0; i < array.length; i++) {
            array[i]=random.nextInt (10) + 1;
        }
        return array;
    }
//initConsoleArray
    static int[] arrayInConsole(Scanner scanner, int[] array) {
        System.out.println ("Enter value:");
        for (int i=0; i < array.length; i++) {
            array[i]=scanner.nextInt ();
        }
        return array;
    }

    static void outPutArray(int[] array) {
        System.out.println ("Origin array: " + Arrays.toString (array));
    }
outPutArray. Overloaded methods!!
    static void outPutArrayString(String[] array) {
        System.out.println ("Origin array: " + Arrays.toString (array));
    }
//findArrayLength
    static int arrayLength(Scanner scanner) {
        System.out.println ("Enter length:");
        int length=scanner.nextInt ();
        if (length < 0) {
            System.out.println ("Try again:");
            return arrayLength (scanner);
        }
        return length;
    }
//It should be placed in 2 separate methods: findMax
//findMin. And return this values. Do not print in here. 
    static void determinMaxMin(int array[]) {
        int max=array[0];
        int min=array[0];
        for (int i=0; i < array.length; i++) {
            if (max < array[i])
                max=array[i];
            if (min > array[i])
                min=array[i];
        }
        System.out.println ("Min: " + min + "\n" + "Max: " + max);
    }
//sort not sortING
    static void sorting(int[] array) {
        int k=0;
        int temp=0;
        while (k < array.length) {
            for (int i=0; i < array.length - 1 - k; i++) {
                if (array[i] > array[i + 1]) {
                    temp=array[i + 1];
                    array[i + 1]=array[i];
                    array[i]=temp;
                }
            }
            k++;
        }
//do not print it here. Look at your method name
//does it tell me that it is printing something?
        System.out.println (Arrays.toString (array));
    }

    static int findIndex(int[] array, Scanner scanner) {
        System.out.println ("Enter number whose index you want to find:");
        int number=scanner.nextInt ();
        for (int i=0; i < array.length; ++i) {
            if (array[i] == number)
                System.out.println ("Index: " + i);
        }
        return -1;
    }
//initArrayConsoleString
    static String[] arrayInConsoleString(String[] array, Scanner scanner) {
        System.out.println ("Enter words:");
        for (int i=0; i < array.length; i++) {
            array[i]=scanner.next ();
        }
        return array;
    }

    static void sortArrayString(String[] array) {
        Arrays.sort (array);
//print in in another place. You have method for sorting
:/make it overloaded!!!
        System.out.println ("Sorted array: " + Arrays.toString (array));
    }

}


