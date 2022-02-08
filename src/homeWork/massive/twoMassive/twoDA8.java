package homeWork.massive.twoMassive;

//Есть матрица (квадратная). Посчитать сумму элементов, расположенных на главной диагонали
//+
public class twoDA8 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4}, {4, 3, 2, 1}, {7, 8, 9, 6}, {6, 5, 4, 3}};
        int sumArray = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sumArray += array[i][j];
                }
            }
        }
        System.out.print(sumArray);
    }
}
