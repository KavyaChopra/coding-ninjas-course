package stacks;

import linkedListOne.LinkedListNode;

import java.util.Scanner;

public class Stack {
    private LinkedListNode<Integer> head;
    private int size;

    public Stack() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int element) {
        LinkedListNode<Integer> newNode = new LinkedListNode<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        int ans;
        if(head == null) {
            return -1;
        } else {
            ans = head.data;
            head = head.next;
            return ans;
        }
    }

    public int top() {
        if(head == null)
            return -1;
        else
            return head.data;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Stack stack = new Stack();

        int q = scanner.nextInt();

        while (q > 0) {
            int choice, input;
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    input = scanner.nextInt();
                    stack.push(input);
                }
                case 2 -> System.out.println(stack.pop());
                case 3 -> System.out.println(stack.top());
                case 4 -> System.out.println(stack.getSize());
                default -> System.out.println((stack.isEmpty()) ? "true" : "false");
            }

            q -= 1;
        }

    }
}
