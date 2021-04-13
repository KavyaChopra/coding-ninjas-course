package testTwo;

import java.util.Scanner;

public class Dequeue {
    int[] data;
    int  front;
    int  rear;
    int  size;

  public Dequeue(int size) {
    data = new int[size];
    front = -1;
    rear = 0;
    this.size = size;
    }

  public boolean isFull() {
    return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

  public boolean isEmpty() {
    return front == -1;
    }

  public void insertFront(int key) {
    if (isFull()) {
      System.out.println(-1);
      return;
    }
    if (front == -1) {
      front = 0;
      rear = 0;
    } else if (front == 0) front = size - 1;
    else front = front - 1;
    data[front] = key;
    }

  public void insertRear(int key) {
    if (isFull()) {
      System.out.println(-1);
      return;
    }
    if (front == -1) {
      front = 0;
      rear = 0;
    } else if (rear == size - 1) rear = 0;
    else rear = rear + 1;
    data[rear] = key;
    }

  public int deleteFront() {
    if (isEmpty()) return -1;
    if (front == rear) {
      int temp = data[front];
      front = -1;
      rear = -1;
      return temp;
    } else {
      if (front == size - 1) {
        int temp = data[front];
        front = 0;
        return temp;
      } else {
        int temp = data[front];
        front++;
        return temp;
      }
    }
    }

  public int deleteRear() {
    if (isEmpty()) return -1;

    if (front == rear) {
      int temp = data[rear];
      front = -1;
      rear = -1;
      return temp;
    } else if (rear == 0) {
      int temp = data[rear];
      rear = size - 1;
      return temp;
    } else {
      int temp = data[rear];
      rear--;
      return temp;
    }
    }

  public int getFront() {
    if (isEmpty()) return -1;
    return data[front];
    }

  public int getRear() {
    if (isEmpty() || rear < 0) return -1;
    return data[rear];
    }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Dequeue dq = new Dequeue(10);

    while (true) {
      int choice = s.nextInt(), input;
      switch (choice) {
        case 1:
          input = s.nextInt();
          dq.insertFront(input);
          break;
        case 2:
          input = s.nextInt();
          dq.insertRear(input);
          break;
        case 3:
          dq.deleteFront();
          break;
        case 4:
          dq.deleteRear();
          break;
        case 5:
          System.out.println(dq.getFront());
          break;
        case 6:
          System.out.println(dq.getRear());
          break;
        default:
          return;
      }
    }
}
}
