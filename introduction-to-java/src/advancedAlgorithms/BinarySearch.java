package advancedAlgorithms;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        while(start < end) {
            int mid = (end + start) / 2;
            if(arr[mid] > x)
                end = mid;
            else if(arr[mid] < x)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < input.length; i++) {
            input[i] = s.nextInt();
        }
        int element = s.nextInt();
        System.out.println(binarySearch(input, element));
    }
}
