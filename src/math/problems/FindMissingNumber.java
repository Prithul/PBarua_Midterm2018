package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */

/*
 * If n = 10, then array will have 9 elements in the range from 1 to 10.
 * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
 * Write java code to find the missing number from the array. Write static helper method to find it.
 */
public class FindMissingNumber {

    // Method to get missing number
    static int getMissingNo (int array[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;
        for ( i = 0; i< n; i++)
            total -= array[i];
        return total;
    }

    public static void main(String[] args) {

        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int miss = getMissingNo(array,9);
        System.out.println("Missing number is : " + miss);

    }
}
