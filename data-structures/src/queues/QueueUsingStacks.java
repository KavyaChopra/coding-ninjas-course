package queues;

import java.util.Optional;
import java.util.Stack;

public class QueueUsingStacks<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T elem) {
        stack1.push(elem);
    }

    public T dequeue() {
        try {
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
            T temp = stack2.pop();
            while(!stack2.isEmpty())
                stack1.push(stack2.pop());
            return temp;
        }
        catch (Exception e) {
            return (T) Optional.ofNullable(-1).get();
        }
    }

    public boolean isEmpty() {
        return stack2.isEmpty();
    }

    public int getSize() {
        return stack2.size();
    }
}
