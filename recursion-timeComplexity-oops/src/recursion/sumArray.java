package recursion;

import java.util.Scanner;

public class sumArray {
    public static int sum(int[] input) {
    if (input.length == 1) return input[0];
    int[] temp = new int[input.length - 1];
    if (input.length - 1 >= 0) System.arraycopy(input, 1, temp, 0, input.length - 1);
    return input[0] + sum(temp);
    }

  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int input[] = new int[n];
      for(int i = 0; i < n; i++) {
          input[i] = s.nextInt();
      }
      System.out.println(sumArray.sum(input));
    }
}
