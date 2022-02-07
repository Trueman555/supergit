package homeWork.massive.twoMassive;
//Есть матрица. Посчитать сумму элементов в каждой строке

public class twoDA7 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4}, {4, 3, 2, 1}, {7, 8, 9, 6}, {6, 5, 4, 3}};
        int[] sumArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumArray[i] += array[i][j];
            }
            System.out.print(sumArray[i] + "\n");
        }
    }
}
