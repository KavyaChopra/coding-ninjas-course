package stringsAdvanced;

import java.util.Scanner;

public class IsPermutation {

    public static boolean isPermutation(String str1, String str2) {
        int[] frequencyCharacter = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            frequencyCharacter[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            frequencyCharacter[str2.charAt(i)]--;
        }
        for (int j : frequencyCharacter) {
            if (j != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(isPermutation(s1, s2));
    }
}
