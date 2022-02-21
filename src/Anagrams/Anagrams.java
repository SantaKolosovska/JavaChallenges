package Anagrams;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagrams {

//    Two words are anagrams if they contain the same letters but in a different order. Here are a few examples of
//    anagram pairs:
//            “listen” and “silent”
//            “binary” and “brainy”
//            “Paris” and “pairs”
//    For a given input of two strings, return a Boolean TRUE if the two strings are anagrams.
//
//    As an added challenge, for a given array of strings, return separate lists that group anagrams together. For
//    example, the input {“tar,” “rat,” “art,” “meats,” “steam”}, the output should look something like {[“tar,” “rat,”
//    “art”], [“meats,” “steam”]}.

    public static void main(String[] args) {

        int numb = 1;
        Scanner scan = new Scanner(System.in);

        while (numb == 1) {
            System.out.println("Input the first string: ");
            String string1 = scan.nextLine();
            System.out.println("Input the second string: ");
            String string2 = scan.nextLine();

            if (areAnagrams(string1, string2)) {
                System.out.println(string1 + " and " + string2 + " are anagrams.");
                System.out.println();
            } else {
                System.out.println(string1 + " and " + string2 + " are not anagrams.");
                System.out.println();
            }
        }

    }

    public static boolean areAnagrams(String string1, String string2) {
        ArrayList<String> string1ArrLi = new ArrayList<>();
        ArrayList<String> string2ArrLi = new ArrayList<>();

        for (int i = 0; i < string1.length(); i++) {
            string1ArrLi.add(String.valueOf(string1.charAt(i)));
        }

        for (int i = 0; i < string2.length(); i++) {
            string2ArrLi.add(String.valueOf(string2.charAt(i)));
        }

        ArrayList<String> commonLetters1 = new ArrayList<>();
        ArrayList<String> commonLetters2 = new ArrayList<>();
        boolean areAnagrams = false;

        if (string1ArrLi.size() == string2ArrLi.size()) {
            for (int i = 0; i < string1ArrLi.size(); i++) {
                for (int j = 0; j < string2ArrLi.size(); j++) {
                    if (string1ArrLi.get(i).equalsIgnoreCase(string2ArrLi.get(j))) {
                        commonLetters1.add(string1ArrLi.get(i));
                        commonLetters2.add(string2ArrLi.get(j));
                    }
                }
            }
        }

        if (string1ArrLi.size() == commonLetters1.size()) {
            return true;
        } else {
            return false;
        }

    }
}
