package homeWork.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExamTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

        System.out.println ("Choose array to work with:" + "\n" + "1:numbers" + "\n" + "2:strings");
        int choiceOne=scanner.nextInt ();
        if (choiceOne == 2) {
            String[] arrayString=new String[findeArrayLength (scanner)];
            String[] arrayString1=initArrayConsoleString (arrayString, scanner);
            System.out.println ("Origin array: " + Arrays.toString (arrayString1));
            Arrays.sort (arrayString1);
            System.out.println ("Sorted array: " + Arrays.toString (arrayString1));
            replaсeLetter (arrayString1, scanner);

        } else {
            System.out.println ("How do you want to initialize array?" + "\n" + "1: from console" + "\n" +
                    "2: random numbers");
            int choicetwo=scanner.nextInt ();
            int[] array=new int[findeArrayLength (scanner)];

            if (choicetwo == 1) {
                int[] arrayConsole=initConsoleArray (scanner, array);
                System.out.println ("Origin array: " + Arrays.toString (arrayConsole));
                determinMax (arrayConsole);
                determinMin (arrayConsole);
                sort (arrayConsole);
                System.out.println ("Sorted array: " + Arrays.toString (arrayConsole));
                findIndex (arrayConsole, scanner);
            } else {
                int[] arrayRandom=initRandomArray (array);
                System.out.println ("Origin array: " + Arrays.toString (arrayRandom));
                determinMax (arrayRandom);
                determinMin (arrayRandom);
                sort (arrayRandom);
                System.out.println ("Sorted array: " + Arrays.toString (arrayRandom));
                findIndex (arrayRandom, scanner);
            }
        }
    }

    static int[] initRandomArray(int[] array) {
        Random random=new Random ();
        int randomNumber=random.nextInt (10) + 1;
        for (int i=0; i < array.length; i++) {
            array[i]=randomNumber;
        }
        return array;
    }

    static int[] initConsoleArray(Scanner scanner, int[] array) {
        System.out.println ("Enter value:");
        for (int i=0; i < array.length; i++) {
            array[i]=scanner.nextInt ();
        }
        return array;
    }

    static int findeArrayLength(Scanner scanner) {
        System.out.println ("Enter length:");
        int length=scanner.nextInt ();
        if (length < 0) {
            System.out.println ("Try again:");
            return findeArrayLength (scanner);
        }
        return length;
    }

    static void determinMax(int array[]) {
        int max=array[0];
        for (int i=0; i < array.length; i++) {
            if (max < array[i])
                max=array[i];
        }
        System.out.println ("Max: " + max);
    }

    static void determinMin(int array[]) {
        int min=array[0];
        for (int i=0; i < array.length; i++) {
            if (min > array[i])
                min=array[i];
        }
        System.out.println ("Min: " + min);
    }

    static void sort(int[] array) {
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

    static String[] initArrayConsoleString(String[] array, Scanner scanner) {
        System.out.println ("Enter words:");
        for (int i=0; i < array.length; i++) {
            array[i]=scanner.next ();
        }
        return array;
    }

    static String[] replaсeLetter(String[] array, Scanner scanner) {
        System.out.println ("Enter letter you want to replace: ");
        String letter=scanner.next ();
        Random random=new Random ();
        int randomNumber=random.nextInt ();
        for (int i=0; i < array.length; i++) {
            array[i]=array[i].replace (letter, String.valueOf (randomNumber));
            System.out.println (array[i]);
        }
        return array;

    }
}


