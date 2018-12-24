package string.problems;

import java.util.*;

/**
 * Author: Papri Barua
 */

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        //implement

        System.out.println(wordNLength);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){

        Map<Integer, String> map = new HashMap<Integer, String>();

        String st = wordGiven;

        //implement

        String st1 = Arrays.stream(st.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        int length = st1.length();

        map.put(length,st1);

        return map;
    }
}
