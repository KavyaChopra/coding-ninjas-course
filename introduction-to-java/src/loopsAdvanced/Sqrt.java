package loopsAdvanced;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0)
            System.out.print(0);
        if(n == 1 || n == 2)
            System.out.println(1);
        for (int i = 1; i <= n / 2; i++) {
            if(i * i == n) {
                System.out.print(i);
                break;
            }
            else if(i * i > n) {
                System.out.print(i - 1);
                break;
            }
        }
    }
}
