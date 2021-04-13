package testOne;

import java.util.Scanner;

public class Solution {

    public static boolean splitArray(int[] input) {
        return splitArrayHelper(input, 0, 0, 0);
    }

    public static boolean splitArrayHelper(int[] ints, int sIndex, int threeSum, int fiveSum) {
        if(sIndex == ints.length)
            return threeSum == fiveSum;
        if(ints[sIndex] % 3 == 0 && ints[sIndex] % 5 != 0)
            threeSum+= ints[sIndex];
        else if(ints[sIndex] % 5 == 0 && ints[sIndex] % 3 != 0)
            fiveSum+= ints[sIndex];
        else
            return splitArrayHelper(ints, sIndex + 1, threeSum + ints[sIndex], fiveSum)
            || splitArrayHelper(ints, sIndex + 1, threeSum, ints[sIndex] + fiveSum);
        return splitArrayHelper(ints, sIndex + 1, threeSum, fiveSum);
    }

    public static boolean checkSequence(String a, String b) {
        return checkSequenceHelper(a, 0, b, 0);
    }

    public static boolean checkSequenceHelper(String a, int sIndexA, String b, int sIndexB) {
        if(sIndexA == a.length() && sIndexB == b.length())
            return true;
        if(sIndexA == a.length())
            return false;
        if(sIndexB == b.length())
            return true;
        if(a.charAt(sIndexA) == b.charAt(sIndexB))
            return checkSequenceHelper(a, sIndexA + 1, b, sIndexB + 1);
        return checkSequenceHelper(a, sIndexA + 1, b, sIndexB);
    }

    public static int maximumProfit(int[] budget) {
        int[] maxProfitList = new int[budget.length];
        for (int i = 0; i < budget.length; i++) {
            int numSubscribers = 0, cost = budget[i];
            for (int k : budget) {
                if (k >= cost)
                    numSubscribers++;
            }
            maxProfitList[i] = numSubscribers * cost;
        }
        int maxProfit = maxProfitList[0];
        for (int i = 1; i < maxProfitList.length; i++) {
            if(maxProfitList[i] > maxProfit)
                maxProfit = maxProfitList[i];
        }
        return maxProfit;
    }

    public static int maxProfit(int[] budget) {
        quickSort(budget);
        int maxProfit = 0;
        for (int i = 0; i < budget.length; i++) {
            int currentProfit = 0;
            currentProfit = (budget.length - i) * budget[i];
            if(maxProfit < currentProfit)
                maxProfit = currentProfit;
        }
        return maxProfit;
    }

    public static void quickSort(int[] input) {
        quickSortHelper(input, 0, input.length - 1);
    }

    public static void quickSortHelper(int[] input, int sIndex, int eIndex) {
        int pivotIndex = sIndex;
        if(sIndex >= eIndex)
            return;
        int pivotEle = input[sIndex];
        for (int i = sIndex + 1; i <= eIndex; i++) {
            if(input[i] <= pivotEle)
                pivotIndex++;
        }
        int temp = input[pivotIndex];
        input[pivotIndex] = input[sIndex];
        input[sIndex] = temp;
        int i = sIndex, j = eIndex;
        while(i < j) {
            if(input[i] <= pivotEle)
                i++;
            else {
                if(input[j] > pivotEle) {
                }
                else {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                    i++;
                }
                j--;
            }
        }
        quickSortHelper(input, sIndex, pivotIndex - 1);
        quickSortHelper(input, pivotIndex + 1, eIndex);
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(Solution.splitArray(input));
    }
}
