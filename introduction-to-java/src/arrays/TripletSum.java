package arrays;

import java.util.Scanner;

public class TripletSum {

    public static int findTriplet(int[] arr, int x) {
        int tripletNum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(i == j || j == k || i == k)
                        continue;
                    if(arr[i] + arr[k] + arr[j] == x)
                        tripletNum++;
                }
            }
        }
        return tripletNum / 6;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int targetSum = s.nextInt();
        System.out.println();
        System.out.println(findTriplet(arr, targetSum));
    }
}
