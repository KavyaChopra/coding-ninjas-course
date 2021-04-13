package recursionTwo;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] input) {
        quickSortHelper(input, 0, input.length - 1);
    }

    public static void quickSortHelper(int[] input, int sIndex, int eIndex) {
        int pivotIndex = sIndex;
        if(sIndex >= eIndex)
            return;
        int pivotEle = input[sIndex];
        for (int i = sIndex + 1; i <= eIndex; i++) {
            if(input[i] <= pivotEle)
                pivotIndex++;
        }
        int temp = input[pivotIndex];
        input[pivotIndex] = input[sIndex];
        input[sIndex] = temp;
        int i = sIndex, j = eIndex;
        while(i < j) {
            if(input[i] <= pivotEle)
                i++;
            else {
                if(input[j] > pivotEle)
                    j--;
                else {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        quickSortHelper(input, sIndex, pivotIndex - 1);
        quickSortHelper(input, pivotIndex + 1, eIndex);
    }

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        QuickSort.quickSort(input);
        for (int j : input) {
            System.out.print(j + " ");
        }
    }
}
