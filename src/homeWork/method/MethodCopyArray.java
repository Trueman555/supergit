package homeWork.method;
//Скопировать один массив в другой
//Я специально создаю новый метод по заполнению массива, чтобы запомнить
//Я умею использовать метод из других классов
import java.util.Arrays;
import java.util.Scanner;

public class MethodCopyArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int[] array=new int[sizeArray (scanner)];
        int[]array2=arrayValue (scanner,array);
        arrayOutPut (array2);
        arrayCopy (array2);
}
public static int sizeArray(Scanner scanner) {
    System.out.println ("Enter size");
        int sizeArray=scanner.nextInt ();
        if (sizeArray<0) {
            System.out.println ("It is wrong value. Try again");
        }return sizeArray;
}
public static int [] arrayValue(Scanner scanner, int[] array) {
    System.out.println ("Enter value");
        for (int i=0; i <array.length ; i++) {
        array[i]=scanner.nextInt ();
    }return array;
}
static void arrayOutPut (int [] array) {
    System.out.println (Arrays.toString (array));
}
static void arrayCopy(int[] array) {
    int [] copyArray=new int[array.length];
        for (int i=0; i <array.length ; i++) {
            copyArray [i]=array[i];

    }System.out.println (Arrays.toString (copyArray));

}
}
