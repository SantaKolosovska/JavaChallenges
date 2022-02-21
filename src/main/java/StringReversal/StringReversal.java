package StringReversal;

import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Character.isLetter;

public class StringReversal {

    // For this challenge, the input is a string of words, and the output should be the words in reverse but with the
    // letters in the original order. For example, the string “Dog bites man” should output as “man bites Dog.”
    // logger as extra

    static final Logger log = Logger.getLogger("StringReversal");

    public static void main(String[] args) {

        System.out.println(reverseString("Dog bites man"));
        System.out.println(reverseString("Nine Inch Nails"));
        System.out.println(reverseString("Yesterday was friday"));
        System.out.println(reverseStringUsingStack("One two three four five"));
        System.out.println(reverseStringUsingStack("It's cold outside"));


    }

    // reverses the order of words in string
    public static String reverseString(String stringToReverse) {
        ArrayList<String> arrayOfWordsInString = new ArrayList<String>();   // arraylist for each word in string
        String word = "";   // string for each word

        for (int i = 0; i < stringToReverse.length(); i++) {
            word += stringToReverse.charAt(i);
            if (stringToReverse.charAt(i) == ' ') {     // adds word to arraylist if space is reached
                arrayOfWordsInString.add(word);
                word = "";  // word is reset to empty string after it's been added to arraylist
            } else if (i == stringToReverse.length() - 1) {    // adds space to the last word in string
                word += " ";
                arrayOfWordsInString.add(word);
            }
        }

        log.info("arrayOfWordsInString: " + arrayOfWordsInString);

        String reversedString = "";
        // looping through arraylist of words in string in reverse and adding them to new string
        for (int i = arrayOfWordsInString.size() - 1; i >= 0; i--) {
            reversedString += arrayOfWordsInString.get(i);
            log.info(arrayOfWordsInString.get(i) + " was added to reversed string");
        }

        return reversedString;
    }

    // reverse string using stack
    public static String reverseStringUsingStack(String stringToReverse) {
        String word = "";
        Stack<String> stackOfWords = new Stack<>();
        String reversedString = "";

        // looping through string and adding each word to stack
        for (int i = 0; i < stringToReverse.length(); i++) {
            if (stringToReverse.charAt(i) != ' ' && i != stringToReverse.length()-1) {
                word += stringToReverse.charAt(i);
            } else if (stringToReverse.charAt(i) == ' ') {      // resetting word to empty when space is reached
                stackOfWords.push(word);
                word = "";
            } else if (i == stringToReverse.length() - 1) {     // pushing the last word to stack
                word += stringToReverse.charAt(i);
                stackOfWords.push(word);
            }
        }

        // popping words from stack to the reversed string
        int sizeOfStack = stackOfWords.size();
        for (int i = 0; i < sizeOfStack; i++) {
            reversedString += stackOfWords.pop() + " ";
        }

        return reversedString;
    }

    // reverses string character by character
    public static String reverseStringFully(String stringToReverse) {
        String reversedString = "";

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedString += stringToReverse.charAt(i);
        } return reversedString;
    }

}
