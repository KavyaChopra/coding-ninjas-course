package assignment;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < i + 1; j++) {
                    sum+= j + 1;
                    if(j == i)
                        System.out.print(j + 1 + "=" + sum);
                    else
                        System.out.print(j + 1 + "+");
            }
            System.out.println();
        }
    }
}
