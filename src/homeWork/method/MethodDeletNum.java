package homeWork.method;
//удалить элемент из массива

import java.util.Arrays;
import java.util.Scanner;

public class MethodDeletNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int[] array=new int[MethodPositiveNum.arraySize (scanner)];
        MethodPositiveNum.outPutArray (MethodPositiveNum.arrayIn (scanner, array));
        deletNumber (scanner, array);
    }

    public static void deletNumber(Scanner scanner, int array[]) {
        System.out.println ("Enter number to delete");
        int number=scanner.nextInt ();
        int[] copy=new int[array.length - 1];
        for (int i=0, j=0; i < array.length; i++) {
            if (array[i] != number) {
                copy[j++]=array[i];
            }
        }
        System.out.println (Arrays.toString (copy));
    }
}