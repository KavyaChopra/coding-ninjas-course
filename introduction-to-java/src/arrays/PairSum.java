package arrays;

import java.util.Scanner;

public class PairSum {
    public static int pairSum(int arr[], int x) {
        int pairNum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j)
                    continue;
                if(arr[i] + arr[j] == x)
                    pairNum++;
            }
        }
        return pairNum / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int targetSum = scanner.nextInt();
        System.out.println();
        System.out.println(pairSum(arr, targetSum));
    }
}
