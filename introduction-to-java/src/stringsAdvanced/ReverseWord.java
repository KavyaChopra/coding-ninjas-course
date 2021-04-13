package stringsAdvanced;

import java.util.Scanner;

import static strings.CountWords.countWords;

public class ReverseWord {

    public static String reverse(String input) {
        String finString = "";
        for (int j = input.length() - 1; j >= 0; j--)
            finString+= input.charAt(j);
        return finString;
    }

    public static String reverseEachWord(String str) {
        String finString = "";
        int wordCount = countWords(str), currentWordCount = 0;
        int sIndex, eIndex = 0;
        String[] wordsInString = new String[wordCount];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                if(currentWordCount == 0)
                    sIndex = eIndex;
                else
                    sIndex = eIndex + 1;
                eIndex = i;
                wordsInString[currentWordCount] = str.substring(sIndex, eIndex);
                currentWordCount++;
                if(currentWordCount == wordCount - 1) {
                    sIndex = eIndex + 1;
                    wordsInString[currentWordCount] = str.substring(sIndex);
                    currentWordCount++;
                }
            }
        }
        for (int i = 0; i < wordsInString.length; i++) {
            if(i == wordsInString.length - 1)
                finString+= reverse(wordsInString[i]);
            else
                finString+= reverse((wordsInString[i])) + " ";
        }
        return finString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(reverseEachWord(s));
    }
}
