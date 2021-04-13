package fundamentals;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;
        while(i < n) {
            if(n % i == 0)
                System.out.print(i + " ");
            i++;
        }
    }
}
