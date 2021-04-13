package advancedArrayAlgorithm;

import java.util.Scanner;
import static inputOutput.InputOutput.*;

public class SortZeroOneTwo {
    public static void sort012(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int j : arr) {
            if (j == 0)
                count0++;
            else if (j == 1)
                count1++;
            else
                count2++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(count0 != 0) {
                arr[i] = 0;
                count0--;
            }
            else if(count1 != 0) {
                arr[i] = 1;
                count1--;
            }
            else {
                arr[i] = 2;
                count2--;
            }
        }
    }

    public static void sort012Optimal(int[] arr) {
        int[] temp = new int[arr.length];
        int nextZeroIndex = 0, nexTwoIndex = arr.length - 1;
        for (int j : arr) {
            if (j == 0) {
                temp[nextZeroIndex] = 0;
                nextZeroIndex++;
            }
            else if(j == 2) {
                temp[nexTwoIndex] = 2;
                nexTwoIndex--;
            }
        }
        for (int i = nextZeroIndex; i <= nexTwoIndex; i++)
            temp[i] = 1;
        copyArray(arr, temp);
    }

    public static void sort012Optimal2(int[] arr) {

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        takeInput(input, s);
        sort012Optimal(input);
        printOutput(input);
    }
}
