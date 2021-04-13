package testOne;

import java.util.Scanner;

public class solution {
    public static void print2DArray(int input[][]) {
        int rows = input.length;
        int columns = input[0].length;
        for (int i = 0; i < rows; i++) {
            int counter = rows - i;
            while(counter != 0) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(input[i][j] + " ");
                }
                counter--;
                System.out.println();
            }
        }
    }

    public static void leaders(int[] input) {
        for (int i = 0; i < input.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < input.length; j++) {
                if(input[j] > input[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.print(input[i] + " ");
        }
    }

    public static int countWords(String str) {
        int count = 0;
        if(str.length() == 0)
            return 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
                ++count;
        }
        return count + 1;
    }

    public static String minLengthWord(String input) {
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
        String minString = wordsInString[0];
        for (int i = 0; i < wordsInString.length; i++) {
            if(wordsInString[i].length() < minString.length())
                minString = wordsInString[i];
        }
        return minString;
    }

    static Scanner s = new Scanner(System.in);

    public static int[][] takeInput() {
        int numRows = s.nextInt();
        int numCols = s.nextInt();
        int[][] input = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = s.nextInt();
        }
        solution.leaders(input);
    }

}
