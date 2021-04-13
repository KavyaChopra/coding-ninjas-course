package recursionAssignment;

import java.util.Scanner;

public class Palindrome {
    public static boolean isStringPalindrome(String input) {
        return isStringPalindromeHelper(input, 0, input.length() - 1);
    }

    public static boolean isStringPalindromeHelper(String input, int sIndex, int lIndex) {
        if(sIndex >= lIndex)
            return true;
        return (input.charAt(sIndex) == input.charAt(lIndex) && isStringPalindromeHelper(input, sIndex + 1, lIndex - 1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(Palindrome.isStringPalindrome(input));
    }
}
