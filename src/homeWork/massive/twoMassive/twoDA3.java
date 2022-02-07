package homeWork.massive.twoMassive;
//Пользователь вводит размерности двумерного массива (прямоугольный,
//        все строки одинаковой длины !=числу столбцов) и заполняет (через сканнер)

import java.util.Scanner;

public class twoDA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size row");
        int sizeRow = scanner.nextInt();
        System.out.println("Enter size column");
        int sizeColumn = scanner.nextInt();
        int[][] array = new int[sizeRow][sizeColumn];
        if (sizeRow != sizeColumn) {
            for (int i = 0; i < sizeRow; i++) {
                for (int j = 0; j < sizeColumn; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < sizeRow; i++) {
                for (int j = 0; j < sizeColumn; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("You entered wrong size");
        }
    }


}
