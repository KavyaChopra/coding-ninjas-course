package recursionAssignment;

import java.util.Scanner;

public class StringToInteger {
    public static int convertStringToInt(String input) {
        return convertStringToIntHelper(input, 0, 0);
    }

    public static int convertStringToIntHelper(String s, int sIndex, int smallAns) {
        if(sIndex == s.length())
            return smallAns;
        if(smallAns == 0 && s.charAt(sIndex) == '0')
            return convertStringToIntHelper(s, sIndex + 1, smallAns);
        smallAns = (10 * smallAns) + (s.charAt(sIndex) - '0');
        return convertStringToIntHelper(s, sIndex + 1, smallAns);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(StringToInteger.convertStringToInt(input));
    }
}
