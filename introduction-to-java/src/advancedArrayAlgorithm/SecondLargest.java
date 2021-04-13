package advancedArrayAlgorithm;

import java.util.Scanner;

import static inputOutput.InputOutput.*;

public class SecondLargest {
    public static boolean allSame(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] != arr[i])
                return false;
        }
        return true;
    }

    public static int largestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] > largest)
                largest = arr[i + 1];
        }
        return largest;
    }

    public static int secondLargestElement(int[] arr) {
        if(arr.length <= 1 || allSame(arr))
            return Integer.MIN_VALUE;
        int secondLargest = arr[0];
        int largest = largestElement(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] > secondLargest && arr[i + 1] < largest)
                secondLargest = arr[i + 1];
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        takeInput(input, s);
        System.out.print(secondLargestElement(input));
    }
}
