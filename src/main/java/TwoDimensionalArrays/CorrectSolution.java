package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class CorrectSolution {

    static final Logger log = Logger.getLogger("StringReversal");

    public static void main(String[] args) {
        // Given a square matrix, calculate the absolute difference between the sums of its diagonals.
        // Input Format:
        // The first line contains a single integer n - the number of rows and columns in the square matrix.
        // Each of the next  lines describes a row arr[i] and consists of n space-separated integers arr[i][j].
        // (That's where I made mistake by thinking I need to use the first line as a part of 2d array)

        // using createNestedList() method

//        List<List<Integer>> nestedList = new ArrayList<List<Integer>>;
        List<List<Integer>> nestedListWithMethod = createNestedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Nested list created and printed with methods: ");
        printOutNestedList(nestedListWithMethod);

//        System.out.println(createNestedList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(diagonalDifference(createNestedList(1, 2, 3, 4, 5, 6, 7, 8, 9)));


        // short way to create a nested list

        ArrayList<Integer> arrLi1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> arrLi2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> arrLi3 = new ArrayList<Integer>(Arrays.asList(7, 8, 9));
        List<List<Integer>> nestedList = new ArrayList<List<Integer>>(Arrays.asList(arrLi1, arrLi2, arrLi3));

        System.out.println("How the nested list looks: " + nestedList);

        // printing out
        System.out.println(arrLi1);
        System.out.println(arrLi2);
        System.out.println(arrLi3);

        System.out.println();
        System.out.println(nestedList);

        System.out.println();
        System.out.println("Diagonal difference: " + diagonalDifference(nestedList));

        // long way to create a nested list
        List<List<Integer>> nestedList2 = new ArrayList<List<Integer>>();

        List innerList11 = new ArrayList<Integer>();
        innerList11.add(11);
        innerList11.add(2);
        innerList11.add(4);

        List innerList12 = new ArrayList<Integer>();
        innerList12.add(4);
        innerList12.add(5);
        innerList12.add(6);

        List innerList13 = new ArrayList<Integer>();
        innerList13.add(10);
        innerList13.add(8);
        innerList13.add(-12);

        nestedList2.add(innerList11);
        nestedList2.add(innerList12);
        nestedList2.add(innerList13);

        System.out.println();
        System.out.println("Contents of the 2d array/nested list: ");
        System.out.println(innerList11);
        System.out.println(innerList12);
        System.out.println(innerList13);

        System.out.println("Difference between primary and secondary diagonal: " + diagonalDifference(nestedList2));

    }

    // THE CORRECT ONE - first line with one number is not included in 2d array
    public static int diagonalDifference(List<List<Integer>> arr) {

        int sumPrimaryDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (j == i) {
                    sumPrimaryDiagonal += arr.get(i).get(j);
                }
            }
        }
        log.info("Primary diagonal: " + sumPrimaryDiagonal);

        int sumSecondaryDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.get(i).size() - 1; j >= 0; j--) {
                if (j == arr.get(i).size() - i - 1) {
                    sumSecondaryDiagonal += arr.get(i).get(j);
                }
            }
        }
        log.info("Secondary diagonal: " + sumSecondaryDiagonal);

        return Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);
    }

    // method to create nested list with 9 numbers for matrix with 3 rows and 3 columns
    public static List<List<Integer>> createNestedList(int one, int two, int three, int four, int five, int six, int seven, int eight, int nine) {
        ArrayList<Integer> arrayListOfNumbers = new ArrayList<Integer>(Arrays.asList(one, two, three, four, five, six, seven, eight, nine));
        ArrayList<Integer> arrLi1 = new ArrayList<Integer>();
        ArrayList<Integer> arrLi2 = new ArrayList<Integer>();
        ArrayList<Integer> arrLi3 = new ArrayList<Integer>();

        for (int i = 0; i < arrayListOfNumbers.size(); i++) {
            if (i < 3) {
                arrLi1.add(arrayListOfNumbers.get(i));
            } else if (i >= 3 && i < 6) {
                arrLi2.add(arrayListOfNumbers.get(i));
            } else if (i >= 6) {
                arrLi3.add(arrayListOfNumbers.get(i));
            }
        }

        List<List<Integer>> nestedList = new ArrayList<List<Integer>>(Arrays.asList(arrLi1, arrLi2, arrLi3));

        return nestedList;
    }

    public static void printOutNestedList(List<List<Integer>> nestedList) {
        for (int i = 0; i < nestedList.size(); i++) {
            if (i == 0) {
                System.out.println(nestedList.get(i));
            } else if (i == 1) {
                System.out.println(nestedList.get(i));
            } else if (i == 2) {
                System.out.println(nestedList.get(i));
            }
        }
    }
}

