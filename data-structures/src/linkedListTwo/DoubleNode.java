package linkedListTwo;

import linkedListOne.LinkedListNode;

public class DoubleNode {
    public LinkedListNode<Integer> head;
    public LinkedListNode<Integer> tail;

    public DoubleNode(LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {
        this.head = head;
        this.tail = tail;
    }

    public DoubleNode() {
        this(new LinkedListNode<>(0), new LinkedListNode<>(0));
    }
}
