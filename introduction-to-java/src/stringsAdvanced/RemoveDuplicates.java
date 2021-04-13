package stringsAdvanced;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        String finString = "";
        int i = 0, index = 0;
        while(i < str.length()) {
            finString+= str.charAt(i);
            if(str.charAt(i) == str.charAt(i + 1)) {
                index = i;
                while(str.charAt(i) == str.charAt(index)) {
                    index++;
                    if(index == str.length() - 1)
                        return finString;
                }
                i = index;
            }
            else
                i++;
        }
        return finString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println(removeConsecutiveDuplicates(s1));
    }
}
