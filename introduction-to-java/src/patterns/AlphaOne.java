package patterns;

import java.util.Scanner;

public class AlphaOne {
    public static void main(String[] args) {
        char ch = 'A';
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print((char) (ch + i));
            System.out.println();
        }
    }
}
