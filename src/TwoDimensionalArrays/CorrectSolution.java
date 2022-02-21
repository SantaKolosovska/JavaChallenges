package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class CorrectSolution {
    public static void main(String[] args) {
        // Given a square matrix, calculate the absolute difference between the sums of its diagonals.
        // Input Format:
        // The first line contains a single integer n - the number of rows and columns in the square matrix.
        // Each of the next  lines describes a row arr[i] and consists of n space-separated integers arr[i][j].
        // (That's where I made mistake by thinking I need to use the first line as a part of 2d array)

        // CORRECT SOLUTION
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

        int sumSecondaryDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.get(i).size() - 1; j >= 0; j--) {
                if (j == arr.get(i).size() - i - 1) {
                    sumSecondaryDiagonal += arr.get(i).get(j);
                }
            }
        }

        System.out.println("Primary diagonal: " + sumPrimaryDiagonal);
        System.out.println("Secondary diagonal: " + sumSecondaryDiagonal);
        return Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);
    }
}

