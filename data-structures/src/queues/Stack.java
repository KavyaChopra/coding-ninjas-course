package queues;

import java.util.LinkedList;
import java.util.Queue;

// Stack using 2 queues
public class Stack {

    private final Queue<Integer> queue1;
    private final Queue<Integer> queue2;

    public Stack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public int getSize() {
        return queue1.size();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public void push(int element) {
        queue1.add(element);
    }

    public int pop() {
        if(queue1.isEmpty())
            return -1;
        if(queue1.size() == 1)
            return queue1.remove();
        while(queue1.size() != 1)
            queue2.add(queue1.remove());
        int temp = queue1.remove();
        while(!queue2.isEmpty())
            queue1.add(queue2.remove());
        return temp;
    }

    public int top() {
        if(queue1.isEmpty())
            return -1;
        if(queue1.size() == 1)
            return queue1.peek();
        while(queue1.size() != 1)
            queue2.add(queue1.remove());
        int temp = queue1.peek();
        queue2.add(queue1.remove());
        while(!queue2.isEmpty())
            queue1.add(queue2.remove());
        return temp;
    }
}
