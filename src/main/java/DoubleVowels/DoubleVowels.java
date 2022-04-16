package DoubleVowels;

import java.util.*;

public class DoubleVowels {

    public static void main(String args[]) {
        String input = "Eligible";
        System.out.println("Input: " + input);
        System.out.println("Result: " + doubleVowels(input));
    }


    public static String doubleVowels(String inputOriginal) {
        String input = inputOriginal.toLowerCase(Locale.ROOT);
        List<String> vowelsList = Arrays.asList("a", "e", "i", "o", "u");
        String result = "";

        // using contains()
      for (int i = 0; i < input.length(); i++) {
            if (vowelsList.contains(String.valueOf(input.charAt(i)))) {
                result = result + input.charAt(i) + input.charAt(i);
            } else {
                result += input.charAt(i);
            }
        }

        // using for loop instead of contains()
//        for (int i = 0; i < input.length(); i++) {
//            String charAti = String.valueOf(input.charAt(i));
//            result += charAti;
//            for (int j = 0; j < vowelsList.size(); j++) {
//                if (vowelsList.get(j).equals(charAti)) {
//                    result = result + charAti;
//                }
//            }
//        }

        return result;
    }
}

//
// SOLUTION IN GOLANG
//    func doubleVowels(input string) (result string) {
//        vowels := [...]string{"a", "e", "i", "o", "u"}
//
//        input_to_lower := strings.ToLower(input)
//
//        for i := 0; i < len([]rune(input_to_lower)); i++ {
//        result += string(input_to_lower[i])
//        for j := 0; j < len(vowels); j++ {
//        if vowels[j] == string(input_to_lower[i]) {
//        result = result + string(input_to_lower[i])
//        }
//        }
//        }
//        return
//        }

