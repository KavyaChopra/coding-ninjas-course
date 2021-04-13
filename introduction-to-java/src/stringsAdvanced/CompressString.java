package stringsAdvanced;

import java.util.Scanner;

public class CompressString {
    public static String getCompressedString(String str) {
        String finString = "";
        int i = 0, index = 0, count;
        while(i < str.length()) {
            finString+= str.charAt(i);
            if(i == str.length() - 1)
                return finString;
            if(str.charAt(i) == str.charAt(i + 1)) {
                count = 0;
                index = i;
                while(str.charAt(i) == str.charAt(index)) {
                    index++;
                    count++;
                    if(index == str.length() - 1) {
                        return finString + (count + 1);
                    }
                }
                i = index;
                finString+= Integer.toString(count);
            }
            else
                i++;
        }
        return finString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println(getCompressedString(s1));
    }
}
