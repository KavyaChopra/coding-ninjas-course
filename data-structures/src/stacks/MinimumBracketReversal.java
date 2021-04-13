package stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinimumBracketReversal {
  public static int countBracketReversals(String input) {
      if(input.length() % 2 == 1) return -1;
    if (input.equals("")) return 0;
    Stack<Character> stack = new Stack<>();
    int char1 = 0, char2 = 0, count = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '{') stack.push('{');
      if (input.charAt(i) == '}') {
        if (stack.isEmpty() || stack.peek() != '{') stack.push('}');
        else if (stack.peek() == '{') stack.pop();
      }
    }
    while (!stack.isEmpty()) {
      char1 = stack.pop();
      char2 = stack.pop();
      if (char1 == char2) count++;
      else count += 2;
    }
    return count;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

        String s = br.readLine().trim();
        System.out.println(MinimumBracketReversal.countBracketReversals(s));

    }
}
