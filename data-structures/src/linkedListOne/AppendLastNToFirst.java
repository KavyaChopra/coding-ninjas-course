package linkedListOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static linkedListOne.LengthLinkedList.length;

public class AppendLastNToFirst {
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> newHead = new LinkedListNode<>(Integer.MIN_VALUE);
        LinkedListNode<Integer> newTail = new LinkedListNode<>(Integer.MIN_VALUE);
        int pos = length(head) - n, counter = 0;
        if(n == 0)
            return head;
        if(length(head) == 0)
            return null;
        else {
            while(temp.next != null) {
                if(counter == pos - 1)
                    newTail.next = temp;
                if(counter == pos)
                    newHead.next = temp;
                temp = temp.next;
                counter++;
            }
            temp.next = head;
            head = newHead.next;
            newTail.next.next = null;
            return head;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while (i < datas.length && !datas[i].equals("-1")) {
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

            int n = Integer.parseInt(br.readLine().trim());
            head = AppendLastNToFirst.appendLastNToFirst(head, n);
            print(head);

            t -= 1;
        }

    }
}
