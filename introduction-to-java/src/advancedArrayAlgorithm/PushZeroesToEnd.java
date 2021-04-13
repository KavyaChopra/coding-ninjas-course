package advancedArrayAlgorithm;

import java.util.Scanner;
import static inputOutput.InputOutput.*;

public class PushZeroesToEnd {
    public static void pushZerosAtEnd(int[] arr) {
        int countNonZero = 0, count = 0, i = 0;
        int[] finArr = new int[arr.length];
        while(i < arr.length) {
            if(arr[i] != 0) {
                finArr[count] = arr[i];
                count++;
            }
            i++;
        }
        for (int j = count; j < arr.length; j++)
            finArr[j] = 0;
        System.arraycopy(finArr, 0, arr, 0, arr.length);
    }

    public static void pushZeroesAtEndOptimal(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        takeInput(input, s);
        pushZerosAtEnd(input);
        printOutput(input);
    }
}
