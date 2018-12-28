package string.problems;

/**
 * Author: Papri Barua
 */

import java.util.*;

public class Palindrome {
    /*
      If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
      Palindrome. So write java code to check if a given String is Palindrome or not.
     */
    public static void main(String args[]) {

        // .............................. way #1 ............................

        String original;
        String reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string isn't a palindrome.");

        // ................... way #2 ==> For Unit Test .......................

        String str = "MOM";
        boolean b = isPalindrome(str);
        System.out.println("Is it Palindrome? : " + b);

    }

    public static boolean isPalindrome(String input) {
        int n = input.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
