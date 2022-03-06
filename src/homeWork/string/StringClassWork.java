package homeWork.string;

import java.util.Scanner;

public class StringClassWork {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int compair=stringCompare (enterFirstStr (scanner), enterSecondStr (scanner));
    }

    public static String enterFirstStr(Scanner scanner) {
        System.out.println ("Enter String");
        return scanner.nextLine ();
    }

    public static String enterSecondStr(Scanner scanner) {
        System.out.println ("Enter String");
        return scanner.nextLine ();
    }

    public static int stringCompare(String str1, String str2) {
        for (int i=0; i < str1.length () && i < str2.length (); i++) {
            if (str1.charAt (i) == str2.charAt (i))
                System.out.println ("Strings are equal");
        }
        System.out.println ("Compair str1 & str2:" + str1.compareTo (str2));
        return 0;
    }
}