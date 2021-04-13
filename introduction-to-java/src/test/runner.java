package test;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == n - i - 1) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(n - j);
            }
            System.out.println();
        }
    }
}
