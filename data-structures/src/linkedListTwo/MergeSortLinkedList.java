package linkedListTwo;

import linkedListOne.LinkedListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSortLinkedList {
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if(head == null || head.next == null)
            return head;
        LinkedListNode<Integer> temp = head;
        while(temp.next != null)
            temp = temp.next;
        return mergeSortHelper(head, temp);
    }

    public static LinkedListNode<Integer> mergeSortHelper(LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {
        if(head == tail || head == null)
            return head;
        LinkedListNode<Integer> midNode = midPoint(head);
        LinkedListNode<Integer> midNode2 = midNode.next;
        midNode.next = null;
        LinkedListNode<Integer> smallRes1 = mergeSortHelper(head, midNode);
        LinkedListNode<Integer> smallRes2 = mergeSortHelper(midNode2, tail);
        return mergeTwoSortedLinkedLists(smallRes1, smallRes2);
    }

    public static int length(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int ans = 0;
        while(temp != null) {
            ans++;
            temp = temp.next;
        }
        return ans;
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        if(head == null || head.next == null)
            return head;
        LinkedListNode<Integer> temp = head;
        int lenLinkedList = length(head);
        int counter = (lenLinkedList + 1) / 2 - 1, i = 0;
        while (i < counter) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        LinkedListNode<Integer> temp1 = head1;
        LinkedListNode<Integer> temp2 = head2;
        LinkedListNode<Integer> newHead;
        if(temp1.data < temp2.data) {
            newHead = temp1;
            temp1 = temp1.next;
        } else {
            newHead = temp2;
            temp2 = temp2.next;
        }
        LinkedListNode<Integer> finHead = newHead;
        while(temp1 != null && temp2 != null) {
            if(temp1.data <= temp2.data) {
                newHead.next = temp1;
                temp1 = temp1.next;
            } else {
                newHead.next = temp2;
                temp2 = temp2.next;
            }
            newHead = newHead.next;
        }
        while(temp1 != null || temp2 != null) {
            if(temp1 != null) {
                newHead.next = temp1;
                temp1 = temp1.next;
            } else {
                newHead.next = temp2;
                temp2 = temp2.next;
            }
            newHead = newHead.next;
        }
        return finHead;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }

    public static void print(LinkedListNode<Integer> head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head = takeInput();

            LinkedListNode<Integer> newHead = MergeSortLinkedList.mergeSort(head);
            print(newHead);

            t -= 1;
        }

    }
}
