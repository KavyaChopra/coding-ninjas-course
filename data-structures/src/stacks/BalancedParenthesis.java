package stacks;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedParenthesis {
  public static boolean isBalanced(String expression) {
    if (expression.equals("") || expression.equals(" "))
        return true;
    Stack<Character> stack = new Stack<>();
    int sIndex = 0;
    while(sIndex != expression.length()) {
        if(expression.charAt(sIndex) == '(')
            stack.push('(');
        if(expression.charAt(sIndex) == ')') {
            if(stack.isEmpty())
                return false;
            if(stack.peek() != '(')
                return false;
            else
                stack.pop();
        }
        sIndex++;
    }
    return stack.isEmpty();
  }

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws NumberFormatException, IOException {
    String expression = br.readLine().trim();
    System.out.println(BalancedParenthesis.isBalanced(expression));
  }
}
