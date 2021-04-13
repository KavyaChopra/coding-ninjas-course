package timeComplexityOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayEquilibrium {
    public static int arrayEquilibriumIndex(int[] arr) {
        int lSum, rSum, i;
        for (i = 1; i < arr.length; i++) {
            lSum = 0;
            rSum = 0;
            for (int j = 0; j < i; j++)
                lSum += arr[j];
            for (int j = i + 1; j < arr.length; j++)
                rSum += arr[j];
            if (lSum == rSum)
                return i;
        }
    return -1;
    }

//    find a better algorithm than O(n^2).
//    public static int arrayEquilibriumIndex2(int[] arr) {
//        int tSum = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            tSum+= arr[i];
//        }
//        if(tSum == 0)
//            return arr.length - 1;
//        int lSum = arr[0], rSum = arr[arr.length - 1];
//        int lIndex = 1, rIndex = arr.length - 2;
//        while(lIndex <= rIndex) {
//            if(lSum - rSum < 0) {
//                lSum+= arr[lIndex];
//                lIndex++;
//            }
//            else if(lSum - rSum > 0) {
//                rSum+= arr[rIndex];
//                rIndex--;
//            }
//            else if(lSum == rSum)
//                return lIndex;
//        }
//        return -1;
//    }

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

            int[] arr = takeInput();
            System.out.println(arrayEquilibrium.arrayEquilibriumIndex(arr));

            t -= 1;
        }
    }
}
