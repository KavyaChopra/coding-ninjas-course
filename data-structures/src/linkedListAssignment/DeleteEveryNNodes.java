package linkedListAssignment;

import linkedListOne.LinkedListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteEveryNNodes {
    public static LinkedListNode<Integer> skipMDeleteN(LinkedListNode<Integer> head, int M, int N) {
        if(head == null || head.next == null)
            return head;
        if(N == 0)
            return head;
        if(M == 0)
            return null;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> temp2 = head;
        int counter1 = 1, counter2 = 1;
        while(temp != null) {
            while(counter1 != M) {
                if(temp == null)
                    return head;
                temp = temp.next;
                counter1++;
            }
            if(temp == null)
                return head;
            temp2 = temp.next;
            while(counter2 != N) {
                if(temp2.next == null) {
                    temp.next = null;
                    return head;
                }
                temp2 = temp2.next;
                counter2++;
            }
            counter1 = 1;
            counter2 = 1;
            temp2 = temp2.next;
            temp.next = temp2;
            temp = temp2;
        }
        return head;
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
            String[] m_n = br.readLine().trim().split("\\s");

            int m = Integer.parseInt(m_n[0]);
            int n = Integer.parseInt(m_n[1]);

            LinkedListNode<Integer> newHead = DeleteEveryNNodes.skipMDeleteN(head, m, n);
            print(newHead);

            t -= 1;
        }

    }
}