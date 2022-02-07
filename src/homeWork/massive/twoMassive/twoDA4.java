package homeWork.massive.twoMassive;
//Нарисовать в консоли шахматную доску (8x8)
public class twoDA4 {
    public static void main(String[] args) {
        String[][] ches = {{"w", "b", "w", "b", "w", "b", "w", "b"}, {"b", "w", "b", "w", "b", "w", "b", "w"},
                {"w", "b", "w", "b", "w", "b", "w", "b"}, {"b", "w", "b", "w", "b", "w", "b", "w"}, {"w", "b", "w", "b", "w", "b", "w", "b"},
                {"b", "w", "b", "w", "b", "w", "b", "w"}, {"w", "b", "w", "b", "w", "b", "w", "b"}, {"b", "w", "b", "w", "b", "w", "b", "w"}};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(ches[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        String[][] ches2 = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    ches2[i][j] = "w" + "\t" + "b" + "\t";
                } else {
                    ches2[i][j] = "b" + "\t" + "w" + "\t";
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ches2[i][j]);
            }
            System.out.println();
        }

    }
}
