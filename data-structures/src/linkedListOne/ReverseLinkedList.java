package linkedListOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseLinkedList {
  public static void printReverse(LinkedListNode<Integer> root) {
      if(root == null) {
          System.out.println();
          return;
      }
    LinkedListNode<Integer> temp = root;
    if (temp.next == null) {
      System.out.print(temp.data + " ");
      return;
    }
    printReverse(temp.next);
    System.out.print(temp.data + " ");
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
      ReverseLinkedList.printReverse(head);
      System.out.println();

      t -= 1;
    }
  }
    }
