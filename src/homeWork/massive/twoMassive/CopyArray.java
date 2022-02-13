package homeWork.massive.twoMassive;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        System.out.println(Arrays.toString(copy));
//второй способ
        for (int i = 0; i < array.length; i++) {
            copy [i] = array [i];
        }System.out.println(Arrays.toString(copy));


     }
}
