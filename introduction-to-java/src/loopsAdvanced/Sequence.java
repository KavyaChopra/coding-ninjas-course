package loopsAdvanced;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Sequence {
    static boolean  isIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1])
                return false;
        }
        return true;
    }

    static boolean isDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenArr = scanner.nextInt();
        int[] arr = new int[lenArr];
        boolean isDecreasing = true;
        boolean isIncreasing = false;
        int pivots = 0;
        for (int i = 0; i < lenArr; i++)
            arr[i] = scanner.nextInt();
        if(isIncreasing(arr) || isDecreasing(arr)) {
            System.out.print(true);
            return;
        }
        for (int i = 0; i < lenArr - 1; i++) {
            if(arr[i + 1] > arr[i] && isDecreasing) {
                isDecreasing = false;
                isIncreasing = true;
                pivots++;
            }
            else if(arr[i + 1] < arr[i] && isIncreasing) {
                isIncreasing = false;
                isDecreasing = true;
                pivots++;
            }
        }
        if(pivots > 1 || pivots == 0)
            System.out.print(false);
        else
            System.out.print(true);
    }
}

