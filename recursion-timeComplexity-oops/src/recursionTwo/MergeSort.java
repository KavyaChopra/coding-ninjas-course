package recursionTwo;

import java.util.Scanner;

public class MergeSort {
//    2 6 8 5 4 3
//    arr1 = 2 6 8
//    arr1' = 2 6
//    arr2' = 8
//    arr2 = 5 4 3

    public static void mergeSort(int[] input) {
        if(input.length == 1)
            return;
        int mid = (input.length + 1) / 2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[input.length - mid];
        if (arr1.length >= 0) System.arraycopy(input, 0, arr1, 0, arr1.length);
        for (int i = 0, j = mid; i < arr2.length && j < input.length; i++, j++) {
            arr2[i] = input[j];
        }
        mergeSort(arr1);
        mergeSort(arr2);
        int[] temp = merge(arr1, arr2);
        System.arraycopy(temp, 0, input, 0, temp.length);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
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

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int input[]) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        MergeSort.mergeSort(input);
        printArray(input);
    }
}
