package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */

/**
 * Author : Papri Barua
 */

/*
 * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
 * Write Java program to compute all Permutation of a String
 *
 */
public class Permutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter a string");
        String str = sc.nextLine();
        System.out.println("Permutation of " + str + " String are as below: ");

      // String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
    }

    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

     // Swap Characters at position

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}


