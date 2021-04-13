package recursionAssignment;

import java.util.Scanner;

public class PairStar {
    public static String addStars(String s) {
        return addStarsHelper(s, 0);
    }

//    String s = hello -> {hel*lo}
//    String s = aaaa -> {a*a*a*a}
    public static String addStarsHelper(String s, int sIndex) {
        if(sIndex == s.length() - 1)
            return Character.toString(s.charAt(sIndex));
        if(s.charAt(sIndex) == s.charAt(sIndex + 1))
            return s.charAt(sIndex) + "*" + addStarsHelper(s, sIndex + 1);
        else
            return s.charAt(sIndex) + addStarsHelper(s, sIndex + 1);
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.next();
        System.out.println(addStars(input));
    }
}
