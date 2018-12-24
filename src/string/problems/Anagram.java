package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */

/**
 * Author: Papri Barua
 */
public class Anagram {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        public static void main(String[] args) {

            String input1 = "CAT";
            String input2 = "ACT";
            isAnagram(input1, input2);
        }

        public static void isAnagram(String input1, String input2) {

            //Remove all whitespace first
            String s1 = input1.replaceAll("\\s", "");

            String s2 = input2.replaceAll("\\s", "");

            boolean status = true;

            if (s1.length() != s2.length()) {

                status = false;

            } else {
                //Convert into character array

                char[] s1Array = s1.toLowerCase().toCharArray();

                char[] s2Array = s2.toLowerCase().toCharArray();

                //Sorting both character array

                Arrays.sort(s1Array);

                Arrays.sort(s2Array);

                //Check if both arrays are equal

                status = Arrays.equals(s1Array, s2Array);
            }
            if (status) {
                System.out.println(s1 + " and " + s2 + " are anagrams!");
            } else {
                System.out.println(s1 + " and " + s2 + " are not anagrams!");
            }
        }
    }

