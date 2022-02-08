package homeWork.massive.twoMassive;
//Вывести таблицу умножения используя двумерный массив

import java.util.Scanner;
//if i enter 8, then it print 7x7 table, but as a user i expect 8x8
public class twoDA5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the multiplication table");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                array[i][j] = i * j;
            }
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
