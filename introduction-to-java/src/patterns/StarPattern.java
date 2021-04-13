package patterns;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        left side of the triangle
        for (int i = 0; i < n; i++) {
            int num_blanks = n - i - 1;
            for (int j = 0; j < n; j++) {
                if (j < num_blanks)
                    System.out.print(" ");
                else {
                    System.out.print("*");
                }
            }

//            right side
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }
}
