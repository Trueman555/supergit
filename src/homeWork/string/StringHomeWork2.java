package homeWork.string;

import java.util.Scanner;

public class StringHomeWork2 {
    public static void main(String[] args) {
        String word1="Shalala";
        String word2="Shalalala";
        String word3="Shala";
        Scanner scanner=new Scanner (System.in);
        System.out.println ("Enter index");
        int index=scanner.nextInt ();
        if (index < word1.length () & index < word2.length () & index < word3.length ()) {
            System.out.println (word1.replace (word1.charAt (index), 'd') + " " +
                    word2.replace (word2.charAt (index), 'm')
                    + " " + word3.replace (word3.charAt (index), 'w'));
        } else {
            System.out.println (word1 + "\n " + word2 + "\n " + word3);
        }
    }
}
