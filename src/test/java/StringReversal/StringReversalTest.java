package StringReversal;
import StringReversal.StringReversal;
import org.junit.jupiter.api.Test;

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
}