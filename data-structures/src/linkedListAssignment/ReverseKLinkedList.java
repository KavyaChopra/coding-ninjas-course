package linkedListAssignment;

import linkedListOne.LinkedListNode;
import linkedListTwo.DoubleNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseKLinkedList {
  public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
      if(k == 0)
          return head;
    LinkedListNode<Integer> headOne = null, tailOne = null, temp = head, newHead, smallAnsHead, smallAnsTail;
    int counter = 0;
    while (counter != k && temp != null) {
        if(headOne == null) {
            headOne = head;
            tailOne = head;
        } else {
            tailOne = tailOne.next;
        }
        counter++;
        temp = temp.next;
    }
    if(tailOne == null) {
        return reverseLinkedListBetter(headOne).head;
    }
    else {
        newHead = tailOne.next;
        tailOne.next = null;
        smallAnsHead = reverseLinkedListBetter(headOne).head;
        smallAnsTail = reverseLinkedListBetter(headOne).tail;
        smallAnsTail.next = kReverse(newHead, k);
        return smallAnsHead;
    }
  }

    public static DoubleNode reverseLinkedListBetter(LinkedListNode<Integer> head) {
        DoubleNode ans;
        if(head == null || head.next == null) {
            ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        DoubleNode smallAns = reverseLinkedListBetter(head.next);
        smallAns.tail.next = head;
        head.next = null;
        ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
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
            }
            else {
                tail.next = newNode;
            }
            tail = newNode;
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
            int k = Integer.parseInt(br.readLine().trim());

            LinkedListNode<Integer> newHead = ReverseKLinkedList.kReverse(head, k);
            print(newHead);

            t -= 1;
        }
    }
}
