package patterns;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i + 1; j++)
                System.out.print(i - j + 1);
            System.out.println();
        }
    }
}
