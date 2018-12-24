package string.problems;

/**
 * Created by mrahman on 04/22/17.
 *
 */
/**
 * Author: Papri Barua
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        List<String> list = Arrays.asList(st.split(" "));

        System.out.println("Duplicate & non-duplicate words and their number of occurrences in the string: \n");

        Set<String> uniqueWords = new HashSet<String>(list);

        for (String word : uniqueWords) {

            System.out.println(word + ": " + Collections.frequency(list, word));
        }

        System.out.println("\nLength of the String: "+ st.length());
        System.out.println("Length of the String without whitespaces: "+
                st.replace(" ", "").length());

        int i = st.length() - st.replace(" ", "").length();
        double j = st.replace(" ", "").length()/i;
        double k = st.length()/(i+1);

        System.out.println("Total number of whitespaces are: " + i);
        System.out.println("Total number of words are: " + (i + 1));

        System.out.println("Average length of the words with whitespaces: " + k );
        System.out.println("Average length of the words without whitespaces: " + j );
    }
}
