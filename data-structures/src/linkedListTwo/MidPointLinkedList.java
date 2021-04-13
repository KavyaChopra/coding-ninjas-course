package linkedListTwo;

import linkedListOne.LinkedListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static linkedListOne.LengthLinkedList.length;

public class MidPointLinkedList {
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

    public static void print(LinkedListNode<Integer> head){
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

            LinkedListNode<Integer> mid = MidPointLinkedList.midPoint(head);

            if (mid != null) {
                System.out.println(mid.data);
            }

            t -= 1;
        }

    }
}
