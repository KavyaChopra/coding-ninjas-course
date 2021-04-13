package strings;

import java.util.Scanner;

import static strings.CountWords.countWords;

public class ReverseWordWise {
    public static String reverseWordWise(String input) {
        String finString = "";
        int wordCount = countWords(input), currentWordCount = 0;
        int sIndex, eIndex = 0;
        String[] wordsInString = new String[wordCount];
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                if(currentWordCount == 0)
                    sIndex = eIndex;
                else
                    sIndex = eIndex + 1;
                eIndex = i;
                wordsInString[currentWordCount] = input.substring(sIndex, eIndex);
                currentWordCount++;
                if(currentWordCount == wordCount - 1) {
                    sIndex = eIndex + 1;
                    wordsInString[currentWordCount] = input.substring(sIndex);
                    currentWordCount++;
                }
            }
        }
        for (int i = currentWordCount - 1; i >= 0; i--) {
            if(currentWordCount == 0)
                finString+= wordsInString[i];
            else
                finString+= wordsInString[i] + " ";
        }
        return finString;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(reverseWordWise(input));
    }
}
