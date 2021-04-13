package timeComplexityOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindUnique {

    public static int findUnique(int[] arr) {
        int[] tempArray = new int[1000001];
        for (int j : arr) {
            if (tempArray[j] == 0)
                tempArray[j]++;
            else if (tempArray[j] == 1)
                tempArray[j]--;
        }
        for (int i = 0; i < tempArray.length; i++) {
            if(tempArray[i] == 1)
                return i;
        }
        return 0;
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

            int[] arr = takeInput();
            System.out.println(FindUnique.findUnique(arr));

            t -= 1;
        }
    }
}
