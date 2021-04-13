package queues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueKElements {
  public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < k; i++) stack.push(input.remove());
    while (!stack.isEmpty()) input.add(stack.pop());
    int count = 0;
    while (count < input.size() - k) {
      int x = input.remove();
      input.add(x);
      count++;
    }
    return input;
    }

  static class Input {
    int n;
    int k;
    Queue<Integer> queue;

    public Input(int n, int k, Queue<Integer> queue) {
      this.queue = queue;
      this.n = n;
      this.k = k;
    }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static Input takeInput() throws NumberFormatException, IOException {
    String[] n_k = br.readLine().trim().split(" ");

    int n = Integer.parseInt(n_k[0]);
    int k = Integer.parseInt(n_k[1]);

    String[] values = br.readLine().trim().split(" ");

    Queue<Integer> queue = new LinkedList<>();

    for (int i = 0; i < n; i++) {
      queue.add(Integer.parseInt(values[i]));
    }

    return new Input(n, k, queue);
    }

  public static void main(String[] args) throws NumberFormatException, IOException {
    Input input = takeInput();

    int n = input.n;
    int k = input.k;
    Queue<Integer> queue = input.queue;

      queue = reverseKElements(queue, k);

      while (!queue.isEmpty()) {
      System.out.print(queue.poll() + " ");
    }
    }
}
