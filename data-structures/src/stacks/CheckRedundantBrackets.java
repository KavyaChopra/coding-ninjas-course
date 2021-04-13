package stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CheckRedundantBrackets {

  public static boolean checkRedundantBrackets(String expression) {
    if (expression.equals("") || expression.equals(" ")) return false;
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < expression.length(); i++) {
      if (expression.charAt(i) != ')')
        stack.push(expression.charAt(i));
      if (expression.charAt(i) == ')') {
          int count = 0;
          while(stack.peek() != '(' && !stack.isEmpty()) {
              count++;
              stack.pop();
          }
          stack.pop();
          if(count <= 1)
              return true;
      }
    }
    return false;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

        String expression = br.readLine().trim();
        System.out.println(checkRedundantBrackets(expression));
    }
}
