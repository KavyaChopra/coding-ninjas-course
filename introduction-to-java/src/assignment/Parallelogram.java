package assignment;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num_dots = i;
            for (int j = 0; j < n + num_dots; j++) {
                if(j < num_dots)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
