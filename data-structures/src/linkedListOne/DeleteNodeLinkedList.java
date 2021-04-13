package linkedListOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static linkedListOne.LengthLinkedList.length;

public class DeleteNodeLinkedList {
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> linkNode;
        if(pos >= length(head)) {
            return head;
        }
        if(pos == 0) {
            head = head.next;
            return head;
        } if(pos == length(head) - 1) {
          while(temp.next.next != null)
              temp = temp.next;
          temp.next = null;
          return head;
        } else {
            while(temp != null) {
                if(pos == 1) {
                    linkNode = temp.next.next;
                    temp.next = linkNode;
                    return head;
                }
                pos--;
                temp = temp.next;
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

            int pos = Integer.parseInt(br.readLine().trim());
            head = DeleteNodeLinkedList.deleteNode(head, pos);
            print(head);

            t -= 1;
        }
    }
}
