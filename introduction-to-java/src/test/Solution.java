package test;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int starNum = i;
            for (int j = 0; j < 2 * n + 1; j++) {
                if(j == n || j == starNum || j == 2 * n - starNum) {
                    System.out.print("*");
                }
                else
                    System.out.print(0);
            }
            starNum++;
            System.out.println();
        }
    }
}
