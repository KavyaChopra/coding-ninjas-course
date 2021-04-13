package linkedListAssignment;

import linkedListOne.LinkedListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenAfterOdd {
    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        if(head == null || head.next == null)
            return head;
        LinkedListNode<Integer> oddH = null, evenH = null, oddT = null, evenT = null, temp = head;
        while(temp != null) {
            if(temp.data % 2 == 0) {
                if(evenH == null) {
                    evenH = temp;
                    evenT = temp;
                } else {
                    evenT.next = temp;
                    evenT = evenT.next;
                }
            }
            else {
                if(oddH == null) {
                    oddH = temp;
                    oddT = temp;
                } else {
                    oddT.next = temp;
                    oddT = oddT.next;
                }
            }
            temp = temp.next;
        }
        if (evenT == null) {
            return oddH;
        }
        evenT.next = null;
        if (oddT == null) {
            return evenH;
        }
        oddT.next = evenH;
        return oddH;
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

            LinkedListNode<Integer> newHead = EvenAfterOdd.evenAfterOdd(head);
            print(newHead);

            t -= 1;
        }

    }
}
