package queues;

import linkedListOne.LinkedListNode;

import java.util.Optional;

public class QueueUsingLinkedList<T> {
    private LinkedListNode<T> front;
    private LinkedListNode<T> rear;
    int size;

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(T elem) {
        LinkedListNode<T> node = new LinkedListNode<>(elem);
        if(rear == null) {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = rear.next;
        }
        size++;
    }

    public T front() {
        return front.data;
    }

    public T dequeue() {
        T temp;
        try {
            if(size == 1) {
            temp = front.data;
            rear = null;
            front = null;
            size--;
        } else {
            temp = front.data;
            front = front.next;
            size--;
        }
        return temp;
        }
        catch (NullPointerException e) {
            return (T) Optional.ofNullable(-1).get();
        }
    }

}
