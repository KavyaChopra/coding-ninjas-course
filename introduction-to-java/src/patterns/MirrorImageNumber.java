package patterns;

import java.util.Scanner;

public class MirrorImageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num_blanks = n - i - 1;
            int k = 1;
            for (int j = 0; j < n; j++) {
                if(j < num_blanks)
                    System.out.print(" ");
                else {
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }
    }
}
