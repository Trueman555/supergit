package homeWork.massive.twoMassive;
//Нарисовать бабочку
// Беда, не знаю как 0 заменить на " "

public class twoDA10 {
    public static void main(String[] args) {
        int[][] butterfly = new int[18][18];
        int i = 0;
        int j = 0;

        for (i = 0; i < butterfly.length / 2 + 1; i++) {
            for (j = 0; j < butterfly[i].length; j++) {
                if (j < i) {
                    butterfly[i][j] += j + 1;
                } else if (j >= butterfly[i].length - i) {
                    butterfly[i][j] = butterfly[i].length - j;
                } else {
                    butterfly[i][j] = 0;
                }
            }
        }
        for (i = butterfly.length - 1; i >= butterfly.length / 2 + 1; i--) {
            for (j = 0; j < butterfly[i].length; j++) {
                if (j >= i) {
                    butterfly[i][j] = butterfly[i].length - j;
                } else if (j < butterfly[i].length - i) {
                    butterfly[i][j] = j + 1;
                } else {
                    butterfly[i][j] = 0;
                }
            }
        }
        for (i = 0; i < butterfly.length; i++) {
            for (j = 0; j < butterfly[i].length; j++) {

                System.out.print(butterfly[i][j]);
            }
            System.out.println();

        }
    }
}

