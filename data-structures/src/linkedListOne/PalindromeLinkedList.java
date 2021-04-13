package linkedListOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static linkedListOne.LengthLinkedList.length;

public class PalindromeLinkedList {
    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int counter = 0;
        int lengthLinkedList = length(head);
        int mid = (lengthLinkedList + 1) / 2;
        while(counter < mid) {
            int i = 0;
            LinkedListNode<Integer> countNodes = head;
            while(i < lengthLinkedList - counter - 1) {
                countNodes = countNodes.next;
                i++;
            }
            if(!temp.data.equals(countNodes.data))
                return false;
            counter++;
            temp = temp.next;
        }
        return true;
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

            boolean ans = PalindromeLinkedList.isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }

    }
}

