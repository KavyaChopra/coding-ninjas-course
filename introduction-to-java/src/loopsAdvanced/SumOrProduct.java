package loopsAdvanced;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println();
        while(t > 0) {
            int upperBound = scanner.nextInt();
            int choice = scanner.nextInt();
            int sumRes = 0;
            double productRes = 1;
            if(choice == 1) {
                for (int i = 1; i <= upperBound; i++)
                    sumRes+= i;
                System.out.println(sumRes);
            }
            else if(choice == 2) {
                for (int i = 1; i <= upperBound; i++)
                    productRes*= i;
                System.out.println(productRes);
            }
            else
                System.out.println(-1);
            --t;
        }
    }
}
