package homeWork.massive;

public class homeWork2 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 7, 9, 15};

        int evenNumbers =0;
        int[] even = new int[evenNumbers];
        int j = evenNumbers-1;
        for (int i = 0; i <numbers.length;  i++) {
            if (numbers[i] % 2 == 0 )
                even[j] = numbers[i];
                j++;}
                for ( j=0; j<even.length;j++){
                System.out.println(even[j]);}
        }


    }

