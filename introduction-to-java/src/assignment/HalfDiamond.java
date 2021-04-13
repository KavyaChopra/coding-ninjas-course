package assignment;

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n == 0) {
            System.out.println("*");
            System.out.println("*");
            return;
        }

//        upper triangle
        for (int i = 0; i < n + 1; i++) {
            int k = 1;
            for (int j = 0; j < i + 1; j++) {
                if(j == 0)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            for (int j = i + 1; j < 2 * i + 1; j++) {
                if(j == 2 * i)
                    System.out.print("*");
                else {
                    System.out.print(j - k - 1);
                    k+= 2;
                }
            }
            System.out.println();
        }

//        lower triangle
        for (int i = 0; i < n; i++) {
            int startVal = 0;
            for (int j = 0; j < n - i; j++) {
                if (j == 0)
                    System.out.print("*");
                else if(j == n - i - 2) {
                    startVal = j;
                    System.out.print(j);
                }
                else
                    System.out.print(j);
            }
            for (int j = n - i; j < 2 * (n - i) - 1; j++) {
                if(j == 2 * (n - i - 1))
                    System.out.print("*");
                else if(i == n - 1)
                    System.out.print("");
                else {
                    System.out.print(startVal);
                    startVal--;
                }

            }
            System.out.println();
        }
    }
}
