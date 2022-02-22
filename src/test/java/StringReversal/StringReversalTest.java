package StringReversal;
import StringReversal.StringReversal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringReversalTest {

//    StringReversal stringReversal = new StringReversal();

    @Test
    void reverseString() {
        assertEquals("three two one", StringReversal.reverseString("one two three"));
    }

    @Test
    void reverseStringUsingStack() {
        assertEquals("is name My", StringReversal.reverseString("My name is"));
    }

    @DisplayName("Parameterized test using value source")
    @ParameterizedTest
    @ValueSource(strings = {"one two three"})
    void testIfStringIsReversed(String stringToReverse) {
        assertEquals("three two one", StringReversal.reverseString(stringToReverse));
    }

    @DisplayName("Parameterized test using value source")
    @ParameterizedTest
    @ValueSource(strings = {"one two three"})
    void testIfStringIsReversedUsingStack(String stringToReverse) {
        assertEquals("three two one", StringReversal.reverseStringUsingStack(stringToReverse));
    }
}