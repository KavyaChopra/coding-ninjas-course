package stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {
  public static int[] stockSpan(int[] price) {
    int[] priceSpans = new int[price.length];
    Stack<Integer> priceStack = new Stack<>();
    for (int prices : price) {
      priceStack.push(prices);
    }
    for (int i = price.length - 1; i > -1; i--) {
        Stack<Integer> temp = (Stack<Integer>) priceStack.clone();
        int span = 1, dailyPrice = price[i];
        if(i == 0) {
            priceSpans[0] = 1;
            break;
        }
        if(!temp.isEmpty()) {
            temp.pop();
        }
        while(!temp.isEmpty()) {
            if(temp.peek() >= dailyPrice) {
                priceSpans[i] = span;
                break;
            }
            temp.pop();
            span++;
        }
        priceSpans[i] = span;
        priceStack.pop();
    }
    return priceSpans;
  }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws NumberFormatException, IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] values = br.readLine().trim().split(" ");

        for(int i = 0; i < size; i++) {
            input[i] = Integer.parseInt(values[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
            int[] input = takeInput();

            int[] output = StockSpan.stockSpan(input);

            printArray(output);
    }
}
