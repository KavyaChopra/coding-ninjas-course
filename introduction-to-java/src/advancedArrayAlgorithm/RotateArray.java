package advancedArrayAlgorithm;

import java.util.Scanner;

import static inputOutput.InputOutput.*;

public class RotateArray {
    public static void rotate(int[] arr, int d) {
        if(d == arr.length)
            return;
        for (int j = d; j > 0; j--) {
            int temp = arr[0];
            for (int k = 1; k < arr.length; k++) {
                arr[k - 1] = arr[k];
            }
            arr[arr.length - 1] = temp;
        }
    }

    public static void rotate2(int[] arr, int d) {
        if(d == arr.length)
            return;
        int[] newArr = new int[d];
        for (int i = 0; i < d; i++)
            newArr[i] = arr[i];
        for (int i = 0; i < arr.length - d; i++)
            arr[i] = arr[i + d];
        for (int i = arr.length - d, j = 0; i < arr.length && j < newArr.length; i++, j++)
            arr[i] = newArr[j];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        takeInput(input, s);
        int d = s.nextInt();
        rotate2(input, d);
        printOutput(input);
    }
}
