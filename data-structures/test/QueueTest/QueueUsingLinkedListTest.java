package QueueTest;

import org.junit.Test;
import queues.QueueException;
import queues.QueueUsingLinkedList;

import static org.junit.Assert.*;


public class QueueUsingLinkedListTest {
  @Test
  public void usingQueue() throws QueueException {
    QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
    queue.enqueue(17);
    queue.enqueue(23);
    queue.enqueue(11);
    assertEquals(java.util.Optional.of(17).get(), queue.dequeue());
    assertEquals(java.util.Optional.of(23).get(), queue.dequeue());
    assertEquals(java.util.Optional.of(11).get(), queue.dequeue());
    assertEquals(java.util.Optional.of(-1).get(), queue.dequeue());
  }
}
