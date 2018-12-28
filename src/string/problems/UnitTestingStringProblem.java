package string.problems;

import org.testng.Assert;


public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        //Unit test for the Longest word.............Not working
       /* try {
            String s = "Human brain is a biological learning machine";
            Assert.assertEquals(DetermineLargestWord.findTheLargestWord(s),10,"biological");
            System.out.println("Unit test for DetermineLargestWord is passed");
        }catch (AssertionError as){
            System.out.println("Unit test for DetermineLargestWord is failed");
        }*/


        try {
            String s = "MOM";
            boolean expected = true;
            Assert.assertEquals(Palindrome.isPalindrome(s), expected);
            System.out.println("Unit test for Palindrome is passed");
        }catch (AssertionError as){
            System.out.println("Unit test for Palindrome is failed");
        }


    }

}
