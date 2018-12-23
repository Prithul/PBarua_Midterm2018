package math.problems;

/*
     Implement in java.
     Read this below two array. Find the lowest difference between the two array cell.
     The lowest difference between cells is 1
 */

//   int [] array1 = {30,12,5,9,2,20,33,1};
//   int [] array2 = {18,25,41,47,17,36,14,19};

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {

        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int lowestdiff = lowestDiffCells(array1, array2);
        System.out.println("Lowest difference between two array cells (20-19): " + lowestdiff);
    }


    public static int lowestDiffCells(int a1[], int a2[]){

        int lowestDiff = Integer.MAX_VALUE;
        int min1 = -1;
        int min2 = -1;
        int i = 0;
        int j = 0;
        int n1 = a1.length;
        int n2 = a2.length;
        int diff = 0;

        Arrays.sort(a1);
        Arrays.sort(a2);
        while(i < n1 && j < n2){
            diff = Math.abs(a1[i]-a2[j]);
            if(diff < lowestDiff){
                lowestDiff = diff;
                min1 = a1[i];
                min2 = a2[j];
            }

            if(a1[i] < a2[j]){
                i++;
            }
            else{
                j++;
            }
        }


        return lowestDiff;
    }

}
