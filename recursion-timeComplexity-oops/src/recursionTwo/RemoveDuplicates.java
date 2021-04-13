package recursionTwo;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
        return removeConsecutiveDuplicatesHelper(s, 0);
    }

//    String s = xxxyyyzwwzzz

    public static String removeConsecutiveDuplicatesHelper(String s, int sIndex) {
        if(sIndex == s.length() - 1)
            return Character.toString(s.charAt(sIndex));
        if(s.charAt(sIndex) == s.charAt(sIndex + 1))
            return removeConsecutiveDuplicatesHelper(s, sIndex + 1);
        else
            return s.charAt(sIndex) + removeConsecutiveDuplicatesHelper(s, sIndex + 1);
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.next();
        System.out.println(RemoveDuplicates.removeConsecutiveDuplicates(input));
    }
}
