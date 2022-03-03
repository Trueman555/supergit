package homeWork.method;
//вывести числа которые являются положительными и кратными числу, которое ввел пользователь.
//        Вывести количество совпадений

import java.util.Arrays;
import java.util.Scanner;

public class MethodPositiveNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int[] array=new int[arraySize (scanner)];
        int[] arrayIn=arrayIn (scanner, array);
        outPutArray (arrayIn);
        positiveDublicat (scanner, arrayIn);
    }
    public static int arraySize(Scanner scanner) {
        System.out.println ("Enter size of the array");
        int size=scanner.nextInt ();
        if (size < 0) {
            System.out.println ("Try again");
            return arraySize (scanner);
        }
        return size;
    }
    public static int[] arrayIn(Scanner scanner, int[] array) {
        System.out.println ("Enter value of array");
        for (int i=0; i < array.length; i++) {
            array[i]=scanner.nextInt ();
        }
        return array;
    }
    public static void outPutArray(int[] array) {
        System.out.println (Arrays.toString (array));
    }
    public static void positiveDublicat(Scanner scanner, int[] array) {
        System.out.println ("Enter number");
        int number=scanner.nextInt ();
        int counter=0;
        for (int i=0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % number == 0) {
                counter++;
                System.out.print (array[i] + " ");
            }
        }
        System.out.println ();
        System.out.println ("Counter " + counter);
    }
}
