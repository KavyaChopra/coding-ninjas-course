package recursionAssignment;

import java.util.Scanner;

public class CheckAB {
    public static boolean checkAB(String input) {
        if(input.charAt(0) != 'a')
            return false;
        return checkABHelper(input, 0);
    }

    public static boolean checkABHelper(String s, int sIndex) {
        if(sIndex == s.length())
            return true;
        if(s.charAt(sIndex) == 'a') {
            if(sIndex + 1 == s.length())
                return true;
            else if(s.charAt(sIndex + 1) == 'a')
                return checkABHelper(s, sIndex + 1);
            else if(sIndex + 2 == s.length())
                return false;
            else return s.charAt(sIndex + 1) == 'b' && s.charAt(sIndex + 2) == 'b' && checkABHelper(s, sIndex + 1);
        }
        else if(s.charAt(sIndex) == 'b' && s.charAt(sIndex + 1) == 'b') {
            if(sIndex + 2 == s.length())
                return true;
            else if(s.charAt(sIndex + 2) == 'a')
                return checkABHelper(s, sIndex + 2);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(CheckAB.checkAB(input));
    }
}
