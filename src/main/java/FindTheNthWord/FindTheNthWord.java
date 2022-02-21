package FindTheNthWord;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class FindTheNthWord {

//    Starting with an input string of words, find the second-to-last word of the string. For example, an input of “I
//    love Codecademy” should return “love.”
//    To make your program more challenging, allow for a second numerical input, n, that results in returning the nth
//    word of a string. So, for the string “I can program in Java” and n = 3, the output should be the third word,
//    “program.”
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want to do?");
        System.out.println("1. Find the nth word in string");
        System.out.println("0. Quit");
        String choiceString = scan.nextLine();
        int choice = Integer.parseInt(choiceString);


        while (choice == 1) {
            System.out.println("Input a string: ");
            String stringFromScanner = scan.nextLine();
            System.out.println("Enter number of word to return: ");
            String toInt = scan.nextLine();
            int n = Integer.parseInt(toInt);

            System.out.println("The " + n + ". word in your string is '" +  findNthWordInString(stringFromScanner, n) + "'");
            System.out.println("");
        }
    }

    public static String findNthWordInString(String stringOfWords, int n) {
        ArrayList<String> stringToArrLi = new ArrayList<>();
        String word = "";

        // looping through string and adding each word to arraylist
        for (int i = 0; i < stringOfWords.length(); i++) {
            if (stringOfWords.charAt(i) != ' ' && i != stringOfWords.length() - 1) {
                word += stringOfWords.charAt(i);
            } else if (stringOfWords.charAt(i) == ' ') {      // resetting word to empty when space is reached
                stringToArrLi.add(word);
                word = "";
            } else if (i == stringOfWords.length() - 1) {     // pushing the last word to stack
                word += stringOfWords.charAt(i);
                stringToArrLi.add(word);
            }
        }

        return stringToArrLi.get(n-1).toString();
    }

}
