package DoubleVowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleVowelsTest {

    @Test
    public void testDoubleVowels() {
        assertEquals("baanaanaa", DoubleVowels.doubleVowels("banana"));
        assertEquals("iindiiaanaa joonees", DoubleVowels.doubleVowels("Indiana Jones"));
    }
}