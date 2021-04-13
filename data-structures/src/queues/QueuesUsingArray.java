package queues;

public class QueuesUsingArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueuesUsingArray() {
        this(5);
    }

    public QueuesUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
         return front == -1;
    }

    public void enqueue(int element) throws QueueException {
        if(size == data.length) {
            throw new QueueException();
        }
        if(size == 0)
            front = 0;
//        circular queue (implements the if condition logic)
        rear = (rear + 1) % data.length;
        data[rear] = element;
        size++;
    }

    public int getFront() throws QueueException {
        if(front == -1)
            throw new QueueException();
        return data[front];
    }

    public int dequeue() throws QueueException {
        if(front == -1)
            throw new QueueException();
        int ans = data[front];
        front = (front + 1) % data.length;
        size--;
        if(size == 0) {
            front = -1;
            rear = -1;
        }
        return ans;
    }

}
