package patterns;

import java.util.Scanner;

public class TriangleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        left side of the triangle
        for (int i = 0; i < n; i++) {
            int num_blanks = n - i - 1;
            int k = 1, valRightStart = 0;
            for (int j = 0; j < n; j++) {
                if (j < num_blanks)
                    System.out.print(" ");
                else {
                    if(j == n - 1)
                        valRightStart = i + k - 1;
                    System.out.print(i + k);
                    k++;
                }
            }
            for (int j = 0; j < i; j++)
                System.out.print(valRightStart - j);
            System.out.println();
        }
        System.out.println();
    }
}
