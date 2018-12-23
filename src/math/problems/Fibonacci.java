package math.problems;

import java.util.Scanner;

/*
    Write 40 Fibonacci numbers with java.
*/

    public class Fibonacci {

        public static void main(String[] args) {

        int n, a = 0, b = 0, c = 1;
        System.out.print("40 Fibonacci Numbers:");
        for(int i = 1; i <= 40; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }

        }
    }
