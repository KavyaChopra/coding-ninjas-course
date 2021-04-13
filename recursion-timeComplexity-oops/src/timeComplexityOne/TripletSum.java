package timeComplexityOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TripletSum {
    public static int tripletSum(int[] arr, int x) {
        int tripletNum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            HashSet<Integer> s = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int targetSumMinus = x - (arr[i] + arr[j]);
                if (s.contains(targetSumMinus))
                    tripletNum++;
                else
                    s.add(arr[j]);
            }
        }
        return tripletNum;
    }

  public static int tripletSum3(int[] input, int x) {
    Arrays.sort(input);
    int count = 0;

    for (int i = 0; i < input.length; i++) {
      int st = i + 1;
      int end = input.length - 1;
      int val = x - input[i];

      while (st < end) {
        if (input[st] + input[end] > val) end--;
        else if (input[st] + input[end] < val) st++;
        else {
          int count1 = 0, count2 = 0;
          for (int ptr = st; ptr <= end; ptr++) {
            if (input[ptr] == input[st]) count1++;
            else break;
          }

          for (int ptr = end; ptr >= st; ptr--) {
            if (input[ptr] == input[end]) count2++;
            else break;
          }

          int combinations = count1 * count2;

          if (input[st] == input[end]) combinations = ((end - st + 1) * (end - st)) / 2;

          count += combinations;
          st = st + count1;
          end = end - count2;
        }
      }
    }
    return count;
    }

    public static int tripletSum2(int[] arr, int x) {
        int tripletNum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > x)
                continue;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if(arr[i] + arr[j] > x)
                    continue;
                for (int k = j + 1; k < arr.length; k++) {
                    if(arr[i] + arr[k] + arr[j] == x)
                        tripletNum++;
                }
            }
        }
        return tripletNum;
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
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(TripletSum.tripletSum3(arr, num));

            t -= 1;
        }
    }
}
