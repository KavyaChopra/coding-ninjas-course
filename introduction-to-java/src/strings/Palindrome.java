package strings;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length() && i <= j; i++, j--) {
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(isPalindrome(input));
    }
}
