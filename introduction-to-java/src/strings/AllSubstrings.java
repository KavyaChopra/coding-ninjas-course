package strings;

import java.util.Scanner;

public class AllSubstrings {
    public static void printSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1; j >= i; j--) {
                if(str.substring(i, j + 1) != "")
                    System.out.println(str.substring(i, j + 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        printSubstrings(input);
    }
}
