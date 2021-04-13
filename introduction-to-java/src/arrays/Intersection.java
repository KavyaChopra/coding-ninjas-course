package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intersection {
    public static void intersections(int[] arr1, int[] arr2) {

        for (int j : arr1) {
            int index = linearSearch(arr2, j);
            if (index != -1) {
                System.out.print(j + " ");
                arr2[index] = Integer.MAX_VALUE;
            }
        }
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");


        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            Intersection.intersections(arr1, arr2);
            System.out.println();

            t -= 1;
        }
    }
}
