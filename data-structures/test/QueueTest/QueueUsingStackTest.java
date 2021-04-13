package QueueTest;

import org.junit.Test;
import queues.QueueUsingStacks;
import java.util.Optional;
import static org.junit.Assert.*;

public class QueueUsingStackTest {
    @Test
    public void queueUsingTwoStacks() {
        QueueUsingStacks<Integer> queueUsingStacks = new QueueUsingStacks<>();
        queueUsingStacks.enqueue(5);
        queueUsingStacks.enqueue(3);
        queueUsingStacks.enqueue(1);
        assertEquals(Optional.ofNullable(5).get(), queueUsingStacks.dequeue());
        assertEquals(Optional.ofNullable(3).get(), queueUsingStacks.dequeue());
        assertEquals(Optional.ofNullable(1).get(), queueUsingStacks.dequeue());
        assertEquals(Optional.ofNullable(-1).get(), queueUsingStacks.dequeue());
    }
}
