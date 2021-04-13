package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2; i++) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(f3);
    }
}
