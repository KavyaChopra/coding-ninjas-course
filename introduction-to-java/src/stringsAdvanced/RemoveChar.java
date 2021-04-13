package stringsAdvanced;

import java.util.Scanner;

public class RemoveChar {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String finString = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch)
                finString+= str.charAt(i);
        }
        return finString;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        char c = s.nextLine().charAt(0);
        System.out.println(removeAllOccurrencesOfChar(s1, c));
    }
}
