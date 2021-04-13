package linkedListOne;

public class LinkedListNode<T> {
    public T data;
    public LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        next = null;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }
}
