package arrays;

import java.util.Scanner;

public class SortZeroOne {
    public static void sortZeroesAndOne(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i < j) {
            if(arr[i] == 0)
                i++;
            if(arr[j] == 1)
                j--;
            if(arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println();
        sortZeroesAndOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
