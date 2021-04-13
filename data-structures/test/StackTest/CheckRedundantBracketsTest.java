package StackTest;

import org.junit.Test;
import static org.junit.Assert.*;

import stacks.*;

public class CheckRedundantBracketsTest {

    @Test
    public void redundantBracketsTest() {
        String checkBrackets = "a + (b) + c";
        String checkBrackets2 = "(a + b) + c";
        assertTrue(CheckRedundantBrackets.checkRedundantBrackets(checkBrackets));
        assertNotEquals(true, CheckRedundantBrackets.checkRedundantBrackets(checkBrackets2));
    }
}
