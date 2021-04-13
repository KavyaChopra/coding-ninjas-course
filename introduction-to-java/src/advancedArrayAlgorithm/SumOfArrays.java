package advancedArrayAlgorithm;

import java.util.Scanner;
import static inputOutput.InputOutput.printOutput;
import static java.lang.Math.max;

public class SumOfArrays {
    public static void sumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
        int carry = 0;
        int i, j, k;
        for (i = arr1.length - 1, j = arr2.length - 1, k = output.length - 1; i >= 0 && j >= 0 && k >= 0; i--, j--, k--) {
            int addSum = arr1[i] + arr2[j] + carry;
            if(addSum < 10) {
                output[k] = addSum;
                carry = 0;
            }
            else {
                output[k] = addSum % 10;
                carry = addSum / 10;
                if(k == 1) {
                    output[0] = carry;
                    return;
                }
            }
        }
        while(i >= 0) {
            int sumAdd = arr1[i] + carry;
            carry = sumAdd / 10;
            output[k] = sumAdd % 10;
            if(k == 1)
                output[0] = carry;
            i--;
            k--;
        }
        while(j >= 0) {
            int sumAdd = arr1[j] + carry;
            carry = sumAdd / 10;
            output[k] = sumAdd % 10;
            if(k == 1)
                output[0] = carry;
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }
        int size2 = scanner.nextInt();
        int[] input2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            input2[i] = scanner.nextInt();
        }
        int maxSize = max(size, size2);
        int[] finalArr = new int[maxSize + 1];
        sumOfTwoArrays(input, input2, finalArr);
        printOutput(finalArr);
    }
}
