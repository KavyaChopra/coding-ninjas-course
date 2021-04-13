package stringsAdvanced;

import java.util.Scanner;

public class HighestFrequency {
    public static char highestOccuringChar(String str) {
        int[] frequencyChar = new int[256];
        for (int i = 0; i < str.length(); i++) {
            frequencyChar[str.charAt(i)]++;
        }
        int maxFrequency = frequencyChar[0], index = 0;
        for (int i = 0; i < frequencyChar.length; i++) {
            if(frequencyChar[i] > maxFrequency) {
                maxFrequency = frequencyChar[i];
                index = i;
            }
        }
        return (char) index;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        System.out.println(highestOccuringChar(s1));
    }
}
