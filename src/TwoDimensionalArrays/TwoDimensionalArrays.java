package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TwoDimensionalArrays {

//    Logger log = new Logger()

    public static void main(String args[]) {

        // LOOPING THROUGH 2D ARRAY
        // Read more:https://javarevisited.blogspot.com/2015/09/how-to-loop-two-dimensional-array-in-java.html#ixzz7LSE5hhId

        // let's create board of 4x4
        int[][] board = new int[4][4];

        // let's loop through array to populate board
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = row * col;
            }
        }

        // let's loop through array to print each row and column
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = row * col;
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }


        // LOOPING THROUGH NESTED LIST

        // Given a square matrix, calculate the absolute difference between the sums of its diagonals.
        // Input Format:
        // The first line contains a single integer n - the number of rows and columns in the square matrix.
        // Each of the next  lines describes a row arr[i] and consists of n space-separated integers arr[i][j].
        // (That's where I made mistake by thinking I need to use the first line as a part of 2d array)

        List<List<Integer>> nestedList = new ArrayList<List<Integer>>();

        // LIST 1
        List innerList0 = new ArrayList<Integer>();
        innerList0.add(3);

        List innerList1 = new ArrayList<Integer>();
        innerList1.add(11);
        innerList1.add(2);
        innerList1.add(4);

        List innerList2 = new ArrayList<Integer>();
        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);

        List innerList3 = new ArrayList<Integer>();
        innerList3.add(10);
        innerList3.add(8);
        innerList3.add(-12);


        //LIST 2
//        List innerList0 = new ArrayList<Integer>();
//        innerList0.add(4);
//
//        List innerList1 = new ArrayList<Integer>();
//        innerList1.add(1);
//        innerList1.add(2);
//        innerList1.add(3);
//        innerList1.add(4);
//
//        List innerList2 = new ArrayList<Integer>();
//        innerList2.add(10);
//        innerList2.add(11);
//        innerList2.add(12);
//        innerList2.add(13);
//
//        List innerList3 = new ArrayList<Integer>();
//        innerList3.add(0);
//        innerList3.add(8);
//        innerList3.add(-4);
//        innerList3.add(0);
//
//        List innerList4 = new ArrayList<Integer>();
//        innerList4.add(0);
//        innerList4.add(8);
//        innerList4.add(-4);
//        innerList4.add(1);


        // LIST 3
//        List innerList0 = new ArrayList<Integer>();
//        innerList0.add(3);
//
//        List innerList1 = new ArrayList<Integer>();
//        innerList1.add(1);
//        innerList1.add(2);
//        innerList1.add(3);
//
//        List innerList2 = new ArrayList<Integer>();
//        innerList2.add(4);
//        innerList2.add(5);
//        innerList2.add(6);
//
//        List innerList3 = new ArrayList<Integer>();
//        innerList3.add(9);
//        innerList3.add(8);
//        innerList3.add(9);


        nestedList.add(innerList0);
        nestedList.add(innerList1);
        nestedList.add(innerList2);
        nestedList.add(innerList3);
//        nestedList.add(innerList4);


        // printing out all the inner lists
        System.out.println(innerList0);
        System.out.println(innerList1);
        System.out.println(innerList2);
        System.out.println(innerList3);
//        System.out.println(innerList4);

        System.out.println("Difference using method 2: " + diagonalDifference2(nestedList));
        System.out.println("Difference using method 3: " + diagonalDifference3(nestedList));

    }

    // using size() and the first number
    public static int diagonalDifference2(List<List<Integer>> arr) {
        int sumPrimaryDiagonal = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (j == i - 1) {
                    sumPrimaryDiagonal += arr.get(i).get(j);
                }
            }
        }

        int sumSecondaryDiagonal = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = arr.get(i).size() - 1; j >= 0; j--) {
                if (j == arr.get(i).size() - i) {
                    sumSecondaryDiagonal += arr.get(i).get(j);
                }
            }
        }

        System.out.println("Primary diagonal: " + sumPrimaryDiagonal);
        System.out.println("Secondary diagonal: " + sumSecondaryDiagonal);

        return Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);
    }


    // using first number and including it into 2d array
    public static int diagonalDifference3(List<List<Integer>> arr) {
        int sumPrimaryDiagonal = 0;
        for (int i = 1; i <= arr.get(0).get(0); i++) {
            for (int j = 0; j < arr.get(0).get(0); j++) {
                if (j == i - 1) {
                    sumPrimaryDiagonal += arr.get(i).get(j);
                }
            }
        }

        int sumSecondaryDiagonal = 0;
        for (int i = 1; i <= arr.get(0).get(0); i++) {
            for (int j = arr.get(0).get(0) - 1; j >= 0; j--) {
                if (j == arr.get(0).get(0) - i) {
                    sumSecondaryDiagonal += arr.get(i).get(j);
                }
            }
        }

        System.out.println("Primary diagonal: " + sumPrimaryDiagonal);
        System.out.println("Secondary diagonal: " + sumSecondaryDiagonal);

        return Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);
    }

}





