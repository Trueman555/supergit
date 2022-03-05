package homeWork.string;
//найти есть ли заданный символв строке

import java.util.Scanner;

public class StringHomeWork {
    public static void main(String[] args) {
        String sistemOfADown="Lost in Hollywood";
        Scanner scanner=new Scanner (System.in);
        System.out.println ("Enter letter");
        String letter=scanner.nextLine ();

        char[] charArray=sistemOfADown.toCharArray ();
        for (int i=0; i < charArray.length; i++) {
            if (sistemOfADown.charAt (i) == letter.charAt (0))
                System.out.println ("There is such a letter in the sentence");
        }
//второй способ, конечно же лучше!

        String sistemOfADown2="Lost in Hollywood";
        System.out.println ("Enter letter");
        String letter2=scanner.nextLine ();
        int index=sistemOfADown2.indexOf (letter2);

        if (index == -1) {
            System.out.println ("Letter " + letter2 + " can not be find.");
        } else {
            System.out.println ("Letter " + letter2 + " is find, it index is: " + index);
        }

    }
}
