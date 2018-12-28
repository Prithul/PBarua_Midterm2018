package math.problems;

import org.testng.Assert;


public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        //Factorial Unit Testing ....... Recursion
        try {
            Assert.assertEquals(Factorial.factorial(5), 120);
            System.out.println("Unit test for factorial is passed");
        } catch (AssertionError ar) {
            System.out.println("Unit test for factorial is failed");
        }

        //Factorial Unit Testing ....... Iteration
        try {
            Assert.assertEquals(Factorial.factorial1(5), 120);
            System.out.println("Unit test for factorial is passed");
        } catch (AssertionError ar) {
            System.out.println("Unit test for factorial is failed");

        }

        //FindLowestDifference Unit Testing .....
        try {

            int [] array1 = {30,12,5,9,2,20,33,1};
            int [] array2 = {18,25,41,47,17,36,14,19};
            Assert.assertEquals(FindLowestDifference.lowestDiffCells(array1,array2),1);
            System.out.println("Unit test for FindLowestDifference is passed");
        } catch (AssertionError ar) {
            System.out.println("Unit test for FindLowestDifference is failed");

        }

        //FindMissingNumber Unit Testing .......
        try {

            int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
            int n = 9;
            Assert.assertEquals(FindMissingNumber.getMissingNo(array,n),9);
            System.out.println("Unit test for FindLowestDifference is passed");
        } catch (AssertionError ar) {
            System.out.println("Unit test for FindLowestDifference is failed");

        }

        //LowestNumber Unit Testing .......
        try {

            int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
            int total = 26;
            Assert.assertEquals(LowestNumber.getLowest(array,total),5);
            System.out.println("Unit test for LowestNumber is passed");
        } catch (AssertionError ar) {
            System.out.println("Unit test for LowestNumber is failed");

        }

    } // main ends


}  // class ends
