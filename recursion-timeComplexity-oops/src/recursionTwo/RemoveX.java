package recursionTwo;

import java.util.Scanner;

public class RemoveX {
    public static String removeX(String input) {
        return removeXHelper(input, 0);
    }

    public static String removeXHelper(String input, int sIndex) {
        if(sIndex == input.length())
            return "";
        if(input.charAt(sIndex) != 'x') {
            return input.charAt(sIndex) + removeXHelper(input, sIndex + 1);
        }
        else
            return removeXHelper(input, sIndex + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(RemoveX.removeX(input));
    }
}
