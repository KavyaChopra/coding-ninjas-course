package assignment;

import java.util.Scanner;

public class OddSquare {

    public static int[] shiftL(int[] arr) {
        int zeroIndex = arr[0];
        int lenArr = arr.length;
        for (int i = 0; i < lenArr - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[lenArr - 1] = zeroIndex;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = 2 * i + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums[j]);
            }
            System.out.println();
            shiftL(nums);
        }
    }
}
