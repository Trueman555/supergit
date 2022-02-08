package homeWork.massive.twoMassive;
//Создать Jagged Array  с помощью пользователя и сканера.
//  int[][] myArray = {{1,2,3}, {56},{1,2,6,1,3,1,3},{2,2}}
import java.util.Scanner;
//+
public class twoDA9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size row");
        int sizeRow = scanner.nextInt();
        int[][] array = new int[sizeRow][];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array[i].length");
            int columnSize = scanner.nextInt();
            array[i] = new int[columnSize];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter value");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


