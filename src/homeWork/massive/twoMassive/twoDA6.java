package homeWork.massive.twoMassive;

import java.util.Scanner;
//+
public class twoDA6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = {{1, 2, 3, 4}, {4, 3, 2, 1}, {7, 8, 9, 6}, {6, 5, 4, 3}};
        System.out.println("Enter number from 1 to 9");
        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    System.out.print(i + " " + j + "\n");
                }
            }
        }
    }
}
