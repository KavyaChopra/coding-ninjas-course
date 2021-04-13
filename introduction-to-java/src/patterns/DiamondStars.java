package patterns;

import java.util.Scanner;

public class DiamondStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        upper triangle
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j <= n / 2; j++) {
                int num_blanks = (n + 1) / 2 - i -1;
                if(j < num_blanks)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        bottom triangle
        for (int i = 0; i < n - (n + 1) / 2; i++) {
            int num_spaces = i + 1;
            for (int j = 0; j <= n / 2; j++) {
                if(j < num_spaces)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            for (int j = (n + 1) / 2; j < n - num_spaces; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
