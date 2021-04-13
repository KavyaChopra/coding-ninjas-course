package loops;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AllPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= (int) (sqrt(i)); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
            else
                continue;
        }
    }
}
