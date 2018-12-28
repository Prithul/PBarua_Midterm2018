package math.problems;

import java.util.Scanner;


/**
 * Created by mrahman on 04/02/18.
 */

/*
 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
 * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
 *
 */
    public class Factorial {

        public static void main(String[] args) {

        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(5) + " ==> Recursive");
        System.out.println("Factorial of "+ num + " is " + factorial1(5) + " ==> Iterative");

        }

    // method to find factorial of given number ..... Recursion
        static int factorial ( int n)
        {
            if (n == 0)
                return 1;

            return n * factorial(n - 1);
        }

    // method to find factorial of given number ..... Iteration
        static int factorial1(int n)
        {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
        }
}
