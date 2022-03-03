package homeWork;

import java.util.Scanner;

public class training1 {
    public static void main(String[] args) {
        Scanner scanner=new  Scanner(System.in);
        System.out.println("Enter number:");
        int num=scanner.nextInt();
        int febPr=0;
        int febNext=1;
        int febPrNext=0;
        int sumFeb=0;

        while (febPrNext<=num) {
            sumFeb+=febPrNext;

            febPrNext=febPr+febNext;
            febPr=febNext;
            febNext=febPrNext;

        }System.out.println(sumFeb);

//        int a=5;
//        int b=2;
//        int c=0;
//        do {c++;
//            System.out.println(c);}while (c<30);




    }
}
