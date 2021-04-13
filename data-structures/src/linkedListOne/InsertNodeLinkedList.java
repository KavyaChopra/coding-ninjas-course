package linkedListOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertNodeLinkedList {
  public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data) {
    LinkedListNode<Integer> temp = head;
    if (pos == 0) {
        LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
        newNode.next = temp;
        return newNode;
    } else {
      while (temp != null) {
        if (pos == 1) {
          LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
          LinkedListNode<Integer> newNodeLink = temp.next;
          temp.next = newNode;
          newNode.next = newNodeLink;
        }
        temp = temp.next;
        pos--;
      }
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
            String[] pos_data = br.readLine().trim().split("\\s");

            int pos = Integer.parseInt(pos_data[0]);
            int data = Integer.parseInt(pos_data[1]);

            head = InsertNodeLinkedList.insert(head, pos, data);
            print(head);

            t -= 1;
        }
    }
}
