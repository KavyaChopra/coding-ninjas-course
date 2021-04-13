package advancedArrayAlgorithm;

import static inputOutput.InputOutput.*;

import java.util.Scanner;

public class CheckRotation {

    public static int arrayRotateCheck(int[] arr) {
        int shift = 0, i = 0;
        if(arr.length == 0)
            return 0;
        while(arr[i + 1] > arr[i] && i < arr.length - 2) {
            shift++;
            i++;
        }
        if(shift + 1 == arr.length - 1)
            return 0;
        return shift + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] input = new int[size];
        takeInput(input, scanner);
        System.out.println(arrayRotateCheck(input));
    }
}
