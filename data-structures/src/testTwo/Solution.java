package testTwo;

import linkedListOne.LinkedListNode;
import java.util.Scanner;

public class Solution {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> last = null;
        LinkedListNode<Integer> cur = head;

        // Iterate till the last node
        while (cur.next != null)
        {
            if (cur.data != 9)
            {
                last = cur;
            }
            cur = cur.next;
        }

        // If last node is not equal to 9
        // add 1 to it and return the head
        if (cur.data != 9)
        {
            cur.data++;
            return head;
        }

        // If list is of the type 9 . 9 . 9 ...
        if (last == null)
        {
            last = new LinkedListNode<>(0);
            last.next = head;
            head = last;
        }

        // For cases when the righmost node which
        // is not equal to 9 is not the last
        // node in the linked list
        last.data++;
        last = last.next;

        while (last != null)
        {
            last.data = 0;
            last = last.next;
        }
        return head;
    }

    static Scanner s = new Scanner(System.in);

    public static LinkedListNode<Integer> takeInput() {
        LinkedListNode<Integer> head = null, tail = null;
        int data = s.nextInt();
        while(data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
            }
            else {
                tail.next = newNode;
            }
            tail = newNode;
            data = s.nextInt();
        }
        return head;
    }

    public static void print(LinkedListNode<Integer> head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListNode<Integer> head = takeInput();
        head = Solution.nextLargeNumber(head);
        print(head);

    }
}
