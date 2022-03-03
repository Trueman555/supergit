package homeWork.method;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;
//как завести в массив данные
public class DublicatMetod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int[]array=new int[initsize (scanner)];
        int [] initArray=initArray (scanner,array);
        outPut (initArray);
}
public static int initsize (Scanner scanner) {
        int size=scanner.nextInt ();
        if (size<0) {
            System.out.println ("Error.Try again!");
            initsize (scanner);
        }return size;

        }
        static int[]initArray(Scanner scanner, int[]array) {
            for (int i=0; i <array.length; i++) {
                array[i]=scanner.nextInt ();
            }
            return array;
        }
        static void outPut(int[]array){
            System.out.println (Arrays.toString(array));
        }

}


