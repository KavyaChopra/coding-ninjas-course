package QueueTest;

import org.junit.Test;
import queues.Stack;

import static org.junit.Assert.*;

public class StackUsingTwoQueuesTest {
    @Test
    public void stackUsingQueues() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        assertEquals(1, stack.top());
        assertEquals(1, stack.pop());
        assertEquals(2, stack.top());
        assertEquals(2, stack.pop());
        assertEquals(3, stack.top());
        assertEquals(3, stack.pop());
        assertEquals(4, stack.top());
        assertEquals(4, stack.pop());
        assertEquals(5, stack.top());
        assertEquals(5, stack.pop());
        assertEquals(-1, stack.pop());
        assertNotEquals(1, stack.getSize());
    }
}
