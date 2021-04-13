package patterns;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
