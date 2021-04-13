package linkedListTwo;

import linkedListOne.LinkedListNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static linkedListOne.LengthLinkedList.length;

public class DeleteNodeRec {
  public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    if (head == null)
        return null;
    if (head.next == null) {
        if(pos == 0)
            return null;
        else
            return head;
    }
    if (length(head) == pos + 1) {
        LinkedListNode<Integer> temp = head;
        while(temp.next.next != null)
            temp = temp.next;
        temp.next = null;
        return head;
    }
    if(pos >= length(head))
        return head;
    return deleteNodeRecHelper(head, pos, head);
  }
  public static LinkedListNode<Integer> deleteNodeRecHelper(LinkedListNode<Integer> head, int pos, LinkedListNode<Integer> origHead) {
      LinkedListNode<Integer> temp = head;
      if(pos == 0) {
          return origHead.next;
      }
      if(pos == 1) {
          temp.next = temp.next.next;
          return origHead;
      }
      return deleteNodeRecHelper(temp.next, pos - 1, origHead);
  }

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static LinkedListNode<Integer> takeInput() throws IOException {
    LinkedListNode<Integer> head = null, tail = null;

    String[] datas = br.readLine().trim().split("\\s");

    int i = 0;
    while (i < datas.length && !datas[i].equals("-1")) {
      int data = Integer.parseInt(datas[i]);
      LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
      i += 1;
    }

    return head;
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head = takeInput();
            int pos = Integer.parseInt(br.readLine().trim());

            LinkedListNode<Integer> newHead = DeleteNodeRec.deleteNodeRec(head, pos);
            print(newHead);

            t -= 1;
        }

    }
}
