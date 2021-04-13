package inputOutput;

import java.util.Scanner;

public class InputOutput {
    public static void takeInput(int[] input, Scanner s) {
        for (int i = 0; i < input.length; i++)
            input[i] = s.nextInt();
    }

    public static void printOutput(int[] input) {
        for (int j : input)
            System.out.print(j + " ");
    }

    public static void copyArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = arr2[i];
    }

}
