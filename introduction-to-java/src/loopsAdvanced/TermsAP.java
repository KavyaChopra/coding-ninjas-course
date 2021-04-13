package loopsAdvanced;

import java.util.Scanner;

public class TermsAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTerms = scanner.nextInt();
        int count = 1, n = 1;
        while(count <= numTerms) {
            long term = (long) 3 * n + 2;
            if(term % 4 != 0) {
                System.out.print(term + " ");
                count++;
            }
            n++;
        }
    }
}
