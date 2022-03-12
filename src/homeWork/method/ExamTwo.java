package homeWork.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExamTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        Random random=new Random ();

        System.out.println ("Choose array to work with:" + "\n" + "1:numbers" + "\n" + "2:strings");
        int choiceOne=scanner.nextInt ();
        if (choiceOne == 2) {
            String[] arrayString=new String[arrayLength (scanner)];
            String[] arrayString1=arrayInConsoleString (arrayString, scanner);
            outPutArrayString (arrayString1);
            sortArrayString (arrayString1);
        } else {
            System.out.println ("How do you want to initialize array?" + "\n" + "1: from console" + "\n" +
                    "2: random numbers");
            int choicetwo=scanner.nextInt ();
            int[] array=new int[arrayLength (scanner)];
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

    static int[] arrayInRandom(Random random, int[] array) {
        for (int i=0; i < array.length; i++) {
            array[i]=random.nextInt (10) + 1;
        }
        return array;
    }

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

    static void outPutArrayString(String[] array) {
        System.out.println ("Origin array: " + Arrays.toString (array));
    }

    static int arrayLength(Scanner scanner) {
        System.out.println ("Enter length:");
        int length=scanner.nextInt ();
        if (length < 0) {
            System.out.println ("Try again:");
            return arrayLength (scanner);
        }
        return length;
    }

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

    static String[] arrayInConsoleString(String[] array, Scanner scanner) {
        System.out.println ("Enter words:");
        for (int i=0; i < array.length; i++) {
            array[i]=scanner.next ();
        }
        return array;
    }

    static void sortArrayString(String[] array) {
        Arrays.sort (array);
        System.out.println ("Sorted array: " + Arrays.toString (array));
    }

}


