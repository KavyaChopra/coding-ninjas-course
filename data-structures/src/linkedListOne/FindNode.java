package linkedListOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNode {
    public static int findNode1(LinkedListNode<Integer> head, int n) {
        return findNodeHelper(head, n, 0);
    }

    public static int findNodeHelper(LinkedListNode<Integer> head, int n, int index) {
        LinkedListNode<Integer> temp = head;
        if(temp == null)
            return -1;
        if(temp.data == n)
            return index;
        return findNodeHelper(temp.next, n, index + 1);
    }

    public static int findNode(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> temp = head;
        int indexSol = 0;
        while(temp != null) {
            if(temp.data == n)
                return indexSol;
            temp = temp.next;
            indexSol++;
        }
        return -1;
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
            int n = Integer.parseInt(br.readLine().trim());

            System.out.println(FindNode.findNode(head, n));

            t -= 1;
        }

    }
}
