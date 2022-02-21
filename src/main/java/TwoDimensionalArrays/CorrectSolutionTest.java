package TwoDimensionalArrays;
import TwoDimensionalArrays.CorrectSolution;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CorrectSolutionTest {

    private final CorrectSolution correctSolution = new CorrectSolution();

    @Test
    void checkDifference() {
        List<List<Integer>> nestedList = new ArrayList<List<Integer>>();
        ArrayList<Integer> arrLi1Test = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> arrLi2Test = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> arrLi3Test = new ArrayList<Integer>(Arrays.asList(9, 8, 9));
        List<List<Integer>> nestedListTest = new ArrayList<List<Integer>>(Arrays.asList(arrLi1Test, arrLi2Test, arrLi3Test));

        assertEquals(2, correctSolution.diagonalDifference(nestedListTest));
    }
}