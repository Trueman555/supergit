package homeWork.method;
//Заполнить массив рандомными числами и найти максимальное и минимальное число

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodRandomMaxMin {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        Random random=new Random ();
        int[] array=new int[MethodPositiveNum.arraySize (scanner)];
        int[] arrayInRandom=arrayInRandom (random, array);
        MethodPositiveNum.outPutArray (arrayInRandom);
        maxMin (arrayInRandom);
    }
    public static int[] arrayInRandom(Random random, int[] arrayInRandom) {
        for (int i=0; i < arrayInRandom.length; i++) {
            arrayInRandom[i]=random.nextInt (10) + 1;
        }
        return arrayInRandom;
    }
    public static void maxMin(int array[]) {
        int max=array[0];
        int min=array[0];
        for (int i=0; i < array.length; i++) {
            if (max < array[i])
                max=array[i];
            if (min > array[i])
                min=array[i];
        }
        System.out.println (max + " " + min);
    }
}