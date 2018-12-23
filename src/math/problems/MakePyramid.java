package math.problems;

import java.io.*;

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        // outer loop to handle number of rows
        // n in this case

public class MakePyramid {

    public static void printTriangle(int n) {

        // outer loop

        for (int i=0; i<n; i++)
        {
            // inner loop

            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }

            // inner loop

            for (int j=0; j<=i; j++ )
            {
                // print stars
                System.out.print("* ");
            }

            // end of line after each row
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 100;
        printTriangle(n);
    }
}

