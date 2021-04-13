package advancedAlgorithms;

import java.util.Scanner;

public class MergeSort {
    public static int[] merge(int arr1[], int arr2[]) {
        int[] finArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                finArr[k] = arr1[i];
                i++;
            }
            else {
                finArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            finArr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            finArr[k] = arr2[j];
            k++;
            j++;
        }
        return finArr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int[] input2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            input2[i] = s.nextInt();
        }
        int[] finalArr = merge(input, input2);
        for (int i = 0; i < finalArr.length; i++) {
            System.out.print(finalArr[i] + " ");
        }
    }
}
