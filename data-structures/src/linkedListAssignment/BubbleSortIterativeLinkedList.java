package linkedListAssignment;

import linkedListOne.LinkedListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static linkedListOne.LengthLinkedList.length;

public class BubbleSortIterativeLinkedList {

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prevNode = null, nextNode = head, nodeLink = head;
    for (int i = 0; i < length(head); i++) {
        LinkedListNode<Integer> tempInner = head;
      for (int j = 0; j < length(head) - i - 1; j++) {
          nextNode = tempInner.next;
          if(tempInner.next.data < tempInner.data) {
              if(tempInner == head) {
                  nodeLink = nextNode.next;
                  nextNode.next = tempInner;
                  tempInner.next = nodeLink;
                  head = nextNode;
              }
              else if(tempInner.next.next == null) {
                  return head;
              }
              else {
                  nodeLink = nextNode.next;
                  return head;
              }
          }
          prevNode = tempInner;
          tempInner = tempInner.next;
      }
    }
    return head;
    }

        public static LinkedListNode<Integer> bubbleSort2(LinkedListNode<Integer> head) {
            if(head == null || head.next == null)
                return head;
            for (int i = 0; i < length(head); i++) {
                LinkedListNode<Integer> tempInner = head;
                for (int j = 0; j < length(head) - i - 1; j++) {
                    if(tempInner.next.data < tempInner.data) {
                        int temp = tempInner.data;
                        tempInner.data = tempInner.next.data;
                        tempInner.next.data = temp;
                    }
                    tempInner = tempInner.next;
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
      LinkedListNode<Integer> head = takeInput();

      head = BubbleSortIterativeLinkedList.bubbleSort2(head);
      print(head);
    }
}
