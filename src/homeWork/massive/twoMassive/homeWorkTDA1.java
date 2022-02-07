package homeWork.massive.twoMassive;

public class homeWorkTDA1 {
    public static void main(String[] args) {

        int[][] number1 = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};

         for (int i = 0; i < number1.length; i++) {
            for (int j = 0; j < number1[i].length; j++) {
                System.out.print(number1[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
