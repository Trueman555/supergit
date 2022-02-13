package homeWork.massive.twoMassive;
//удалить элемент из массива
import java.util.Arrays;
import java.util.Scanner;

public class SolutionArrays
{public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter number to delete");
    int number=scanner.nextInt();
    int [] array={1,2,3,4,5,6,7,8,9};
    int[] copy = new int[array.length - 1];
    for (int i = 0, j = 0; i < array.length; i++) {
        if (array [i] != number) {
            copy[j++] = array[i];
        }

    }System.out.println(Arrays.toString(copy));

}
}
